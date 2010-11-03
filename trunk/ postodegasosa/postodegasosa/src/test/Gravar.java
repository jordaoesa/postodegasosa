package test;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Gravar {
	static Scanner input = new Scanner(System.in);
	static List lista = new ArrayList();

	public static void main(String[] args) {

		String opcao = menu();
		while (!(opcao.equals("fim"))) {
			if (opcao.equals("1")) {

				cadastrarNumero();

			} else if (opcao.equals("3")) {
				listar();

			} else if (opcao.equals("4")) {
				ADDlistar();

			} else if (opcao.equals("2")) {
				digite();
				remover(input.next());
			}
			opcao = menu();

		}

	}

	private static void listar() {
		FileReader reader = null;
		try {

			reader = new FileReader("myFile123.xml");

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao existe");
			System.out.println(e.getMessage());// no existe

		}

		XStream xstream = new XStream(new DomDriver());
		try {

			List pw = ((List) xstream.fromXML(reader));// nao consegue ler o
														// arquivo se der erro
														// logo no exist
			System.out.println("sss");
			for (Object i : pw) {
				System.out.println(i);

			}
			System.out.println(pw);// AKI EU TO USANDO O XSTREAM
		} catch (Exception e) {
			System.out.println("Nao existe arquivo.");
		} // PRA CONVERTE O XML PRA
			// OBJETO.....AEW EU TO
			// DANDO UM CATCH(LIST),
			// POIS VALORES EH UMA LIST
			// System.out.println(pw);// AKI EU TO DANDO UM PRINT.....
			// TODO Auto-generated method stub
			// for (Object i : lista) {
			// System.out.println(i);
			// }

	}

	private static void ADDlistar() {
		FileReader reader = null;
		try {

			reader = new FileReader("myFile123.xml");

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao existe.");
			System.out.println(e.getMessage());// no existe

			// CRIA LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL vou tentar ler pra podr
			// add ai num tem ai eu crio o arquivo em branco proximo passo e
			// escrever
			XStream xstream = new XStream(new DomDriver());// CRIA O XSTREAM

			String myXML = xstream.toXML(lista); // VALORES AKI EH UMA ARRAY Q
													// EU VO TRANSFORMA PRA XML,
													// TEM UNS OBJETOS DENTRO DE
													// VALORES, SE LIGA Q PRA
													// TRANSFORMA PRA XML EH
													// SEMPRE ASSIM

			BufferedWriter writer = null;// SERVER PRA ESCREVER DENTRO DO
											// ARQUIVO

			try {
				writer = new BufferedWriter(new FileWriter("myFile123.xml"));// CRIA
																				// O
																				// ARQUIVO
			} catch (IOException e1) {
				// TODO Auto-generated catch block

			}

			try {
				writer.write(myXML);// ESCREVE O OBJETO DENTRO DO ARQUIVO
				writer.close();

			} catch (IOException f) {

				// TODO Auto-generated catch block
				f.printStackTrace();
			} // salva fisicamente
				// LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL

		}// escrevo na proxima vez no arquivo

		XStream xstream = new XStream(new DomDriver());
		try {

			List pw = ((List) xstream.fromXML(reader));// nao consegue ler o
														// arquivo se der erro

			digite();
			pw.add(input.next());

			// CRIA LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL
			// XStream xstream = new XStream(new DomDriver());// CRIA O XSTREAM

			String myXML = xstream.toXML(pw); // VALORES AKI EH UMA ARRAY Q
												// EU VO TRANSFORMA PRA XML,
												// TEM UNS OBJETOS DENTRO DE
												// VALORES, SE LIGA Q PRA
												// TRANSFORMA PRA XML EH
												// SEMPRE ASSIM

			BufferedWriter writer = null;// SERVER PRA ESCREVER DENTRO DO
											// ARQUIVO

			try {
				writer = new BufferedWriter(new FileWriter("myFile123.xml"));// CRIA
																				// O
																				// ARQUIVO
			} catch (IOException e1) {
				// TODO Auto-generated catch block

			}

			try {
				writer.write(myXML);// ESCREVE O OBJETO DENTRO DO ARQUIVO
				writer.close();

			} catch (IOException f) {

				// TODO Auto-generated catch block
				f.printStackTrace();
			} // salva fisicamente
				// logo no exist
				// System.out.println("sss");
			// for (Object i : pw) {
			// System.out.println(i);
			//
			// }
			// System.out.println(pw);// AKI EU TO USANDO O XSTREAM
		} catch (Exception e) {
			System.out.println("Nao existe arquivo");
		} // PRA CONVERTE O XML PRA
			// OBJETO.....AEW EU TO
			// DANDO UM CATCH(LIST),
			// POIS VALORES EH UMA LIST
			// System.out.println(pw);// AKI EU TO DANDO UM PRINT.....
			// TODO Auto-generated method stub
			// for (Object i : lista) {
			// System.out.println(i);
			// }
	}

	
	
	
	
	private static void remover(Object obj) {
		FileReader reader = null;
		List pw = null;
		try {

			reader = new FileReader("myFile123.xml");

		} catch (FileNotFoundException e) {
			System.out.println("aquierrr");
			System.out.println(e.getMessage());// no existe

		}

		XStream xstream = new XStream(new DomDriver());
		try {

			pw = ((List) xstream.fromXML(reader));// nao consegue ler o
													// arquivo se der erro
			System.out.println(pw); // logo no exist
			System.out.println("chegou aqui");
			for (Object i : pw) {
				if (i.equals(obj)) {
					pw.remove(obj);
					break;
				}

			}
			System.out.println(pw);// AKI EU TO USANDO O XSTREAM

			// AGORA ESCREVO ATUALIZANDO
			// XStream xstream = new XStream(new DomDriver());
			String myXML = xstream.toXML(pw); // VALORES AKI EH UMA ARRAY Q EU
												// VO TRANSFORMA PRA XML, TEM
												// UNS OBJETOS DENTRO DE
												// VALORES, SE LIGA Q PRA
												// TRANSFORMA PRA XML EH SEMPRE
												// ASSIM

			BufferedWriter writer = null;// SERVER PRA ESCREVER DENTRO DO
											// ARQUIVO

			try {
				writer = new BufferedWriter(new FileWriter("myFile123.xml"));// CRIA
																				// O
																				// ARQUIVO
			} catch (IOException e1) {
				// TODO Auto-generated catch block

			}

			try {
				writer.write(myXML);// ESCREVE O OBJETO DENTRO DO ARQUIVO
				writer.close();

			} catch (IOException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
			} // salva fisicamente

		} catch (Exception e) {
			System.out.println("Nao existe arquivo");
		} // PRA CONVERTE O XML PRA
			// OBJETO.....AEW EU TO
			// DANDO UM CATCH(LIST),
			// POIS VALORES EH UMA LIST
			// System.out.println(pw);// AKI EU TO DANDO UM PRINT.....
			// TODO Auto-generated method stub
			// for (Object i : lista) {
			// System.out.println(i);
			// }

	}

	private static void cadastrarString() {
		// TODO Auto-generated method stub

		digite();

		lista.add(input.next());
	}

	private static void cadastrarNumero() {
		// TODO Auto-generated method stub
		digite();
		try {
			lista.add(Integer.parseInt(input.next()));
		} catch (Exception e) {
			System.out.println("Nao cadastra string.\n");

		}
	}

	public static String menu() {
		System.out.println("1-cadastrar integer.\n3-listar.\n4-"
				+ "add objeto\n2-remover.\n'fim' para sair.");
		return input.next();
	}

	public static void digite() {
		System.out.println("Digite: ");
	}

}
