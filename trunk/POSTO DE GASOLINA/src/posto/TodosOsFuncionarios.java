/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posto;

/**
 *
 * @author yurisnm
 */
import java.util.ArrayList;
import java.util.List;

public class TodosOsFuncionarios {

    private List<CadastroFuncionario> listaDeFuncionario;

    public TodosOsFuncionarios() {

        listaDeFuncionario = new ArrayList<CadastroFuncionario>();

    }

    // vai adicionar o novo funcionario cadastrado na lista de cadastros de
    // funcionario.
    public void addFuncionario(CadastroFuncionario funcionario) {

        this.listaDeFuncionario.add(funcionario);

    }

    // vai retirar o funcionario cadastrado da lista de cadastros de
    // funcionario.
    public void rmvFuncionario(CadastroFuncionario funcionario) {

        this.listaDeFuncionario.remove(funcionario);

    }

    public List<CadastroFuncionario> getListaDeFuncionario() {

        return this.listaDeFuncionario;

    }
}
