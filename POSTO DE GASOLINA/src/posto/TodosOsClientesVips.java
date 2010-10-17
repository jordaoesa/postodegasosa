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

public class TodosOsClientesVips {

    private List<CadastroClienteVip> listaDeClientes;

    public TodosOsClientesVips() {

        listaDeClientes = new ArrayList<CadastroClienteVip>();

    }

    // vai adicionar o novo funcionario cadastrado na lista de cadastros de
    // funcionario.
    public void addCliente(CadastroClienteVip cliente) {

        this.listaDeClientes.add(cliente);

    }

    // vai retirar o funcionario cadastrado da lista de cadastros de
    // funcionario.
    public void rmvCliente(CadastroClienteVip cliente) {

        this.listaDeClientes.remove(cliente);

    }
}
