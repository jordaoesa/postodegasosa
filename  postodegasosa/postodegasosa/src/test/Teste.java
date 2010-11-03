package test;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Teste {

	public static void main(String[] args) {
		List valores = new ArrayList();
		valores.add(1);
		valores.add(2);
		valores.add("a");
		valores.add(4);
		valores.add(5);
		valores.add(6);
		
		XStream xstream = new XStream(new DomDriver());//CRIA O XSTREAM
        
        String myXML = xstream.toXML(valores);  //VALORES AKI EH UMA ARRAY Q EU VO TRANSFORMA PRA XML, TEM UNS OBJETOS DENTRO DE VALORES, SE LIGA Q PRA TRANSFORMA PRA XML EH SEMPRE ASSIM
          
          BufferedWriter writer = null;//SERVER PRA ESCREVER DENTRO DO ARQUIVO
            
         try {
                    writer = new BufferedWriter(new FileWriter("myFile1.xml"));//CRIA O ARQUIVO
            } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    
            }  
          
          try {
                    writer.write(myXML);//ESCREVE O OBJETO DENTRO DO ARQUIVO
                    writer.close();
                  
            } catch (IOException e) {
                    
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            } //salva fisicamente  
          
          
          
          try{
            //BufferedReader reader = new BufferedReader(new FileReader("myFile.xml"));//AKI VAI LER O ARQUIVO XML
            FileReader reader = new FileReader("myFile1.xml");//CRIA UM LEITO PRO ARQUIVO
         
            //reader
            List pw = ((List)xstream.fromXML(reader));//AKI EU TO USANDO O XSTREAM PRA CONVERTE O XML PRA OBJETO.....AEW EU TO DANDO UM CATCH(LIST), POIS VALORES EH UMA LIST
            System.out.println(pw);//AKI EU TO DANDO UM PRINT.....
          
            
          }catch(Exception e){
        	System.out.println(e.getMessage());
        	  
          }
            
   


	}
}
