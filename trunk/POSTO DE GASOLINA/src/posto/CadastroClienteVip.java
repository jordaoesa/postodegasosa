/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package posto;

/**
 *
 * @author yurisnm
 */
public class CadastroClienteVip {
	private String nomeDoCliente;
	private String senha;
	private Endereco endereco;

	public CadastroClienteVip(String nomeDoCliente, String senha,
			Endereco endereco) {

		this.nomeDoCliente = nomeDoCliente;
		this.senha = senha;
		this.endereco = endereco;

	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}