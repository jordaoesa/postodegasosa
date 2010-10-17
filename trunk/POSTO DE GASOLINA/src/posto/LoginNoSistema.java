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

public class LoginNoSistema {

	private boolean logado;
	private List<CadastroFuncionario> grupoDeFuncionarios;

	public LoginNoSistema(TodosOsFuncionarios lista) {
		this.grupoDeFuncionarios = new ArrayList<CadastroFuncionario>();
		this.grupoDeFuncionarios = lista.getListaDeFuncionario();

	}

	public void logar(String login, String senha) {

		for (CadastroFuncionario func : grupoDeFuncionarios) {
			if (func.getNomeDoFuncionario().equals(login)
					&& func.verificaSenha(senha)) {
				this.logado = true;
				System.out.println("Logado com sucesso");
				break;
			}

		}
		if (this.logado == false) {
			System.out.println("Conta nao encontrada");
		}

	}

	public void deslogar() {
		this.logado = false;
	}

	public boolean getLogado() {
		return this.logado;
	}

}