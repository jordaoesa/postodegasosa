package posto;

/**
 *
 * @author yurisnm
 */
public class Endereco {

	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String telefone;
	private String celular;
	private UnidadeFederativa estado;

	public Endereco(UnidadeFederativa estado, String rua, String numero,
			String bairro, String cidade, String telefone, String celular)
			/*throws Exception*/ {

//		// procurando digitos em rua
//		if (existeDigito(rua)) {
//			throw new Exception("Nome da rua invalido.");
//		}
//		// procurando digitos em bairro
//		if (existeDigito(bairro)) {
//			throw new Exception("Nome do bairro invalido.");
//		}
//		// procurando digitos em cidade
//		if (existeDigito(cidade)) {
//			throw new Exception("Nome da cidade invalida.");
//		}
//		// procurando caracteres em numero
//		if (contaDigitos(numero) < numero.length()) {
//			throw new Exception("Numero invalido.");
//		}
//		// procurando caracteres em telefone
//		if (contaDigitos(telefone) < telefone.length()) {
//			throw new Exception("Telefone invalido.");
//		}
//		// procurando caracteres em celular
//		if (contaDigitos(celular) < celular.length()) {
//			throw new Exception("Celular invalido.");
//		}
//		// tratando estado
//		if (!verificaUF(estado)) {
//			throw new Exception("Estado invalido.");
//		}

		this.estado = estado;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.telefone = telefone;
		this.celular = celular;

	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) throws Exception {
//		// procurando digitos em rua
//		if (existeDigito(rua)) {
//			throw new Exception("Nome da rua invalido.");
//		}

		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) throws Exception {
//		// procurando caracteres em numero
//		if (contaDigitos(numero) < numero.length()) {
//			throw new Exception("Numero invalido.");
//		}

		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) throws Exception {
//		// procurando digitos em bairro
//		if (existeDigito(bairro)) {
//			throw new Exception("Nome do bairro invalido.");
//		}

		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) throws Exception {
//		// procurando digitos em cidade
//		if (existeDigito(cidade)) {
//			throw new Exception("Nome da cidade invalida.");
//		}

		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws Exception {
//		// procurando caracteres em telefone
//		if (contaDigitos(telefone) < telefone.length()) {
//			throw new Exception("Telefone invalido.");
//		}

		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) throws Exception {
//		// procurando caracteres em celular
//		if (contaDigitos(celular) < celular.length()) {
//			throw new Exception("Celular invalido.");
//		}

		this.celular = celular;
	}

	public void setEstado(UnidadeFederativa estado) throws Exception{
//		// tratando estado
//		if (!verificaUF(estado)) {
//			throw new Exception("Estado invalido.");
//		}

		this.estado = estado;
	}

	// Metodo que verifica a existencia de digitos numericos em uma variavel
	// String
	private boolean existeDigito(String nome) {
		for (int i = 0; i < nome.length(); i++) {
			if (nome.charAt(i) >= '0' && nome.charAt(i) <= '9') {
				return true;
			}
		}
		return false;
	}

	// Metodo que conta quantos digitos existem em uma variavel String
	private int contaDigitos(String numero) {
		int contador = 0;
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) >= '0' && numero.charAt(i) <= '9') {
				contador++;
			}
		}
		return contador;
	}

	private boolean verificaUF(UnidadeFederativa estado) {
		for (UnidadeFederativa uf : UnidadeFederativa.values()) {

			if (uf.equals(estado)) {
				return true;
			}
		}
		return false;
	}

}
