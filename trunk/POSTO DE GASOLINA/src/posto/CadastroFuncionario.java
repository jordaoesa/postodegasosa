/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package posto;

/**
 *
 * @author yurisnm
 */
public class CadastroFuncionario {
	// private String nomeDoFuncionario;
	private String tipoDoFuncionario;
	private Pessoa pessoa;
	private String senha;
	private Endereco endereco;

	public CadastroFuncionario(Pessoa pessoa, Endereco endereco,
			String tipoDoFuncionario, String senha) {

		// this.nomeDoFuncionario = nomeDoFuncionario;
		this.tipoDoFuncionario = tipoDoFuncionario;
		this.senha = senha;
		this.endereco = endereco;
		this.pessoa = pessoa;

	}

	public String getNomeDoFuncionario() {
		return this.pessoa.getNome();
	}

	public void setNomeDoFuncionario(String nomeDoFuncionario) throws Exception {
		this.pessoa.setNome(nomeDoFuncionario);
	}

	public String getTipoDoFuncionario() {
		return this.tipoDoFuncionario;
	}

	public void setTipoDoFuncionario(String tipoDoFuncionario) {
		this.tipoDoFuncionario = tipoDoFuncionario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public boolean verificaSenha(String senha) {

		if (this.senha.equals(senha)) {
			return true;
		}
		return false;

	}
}