package posto;

public class Pessoa {

    private String cpf;
    private String rg;
    private String nome;
    private String cnpj;

    public Pessoa(String nome, String cpf, String rg) /*throws Exception*/ {

//		// Verifica autenticidade do cpf
//		if (!verificaCPF(cpf)) {
//			throw new Exception("CPF invalido.");
//		}
//		// Verifica se o nome eh valido
//		if (existeDigito(nome)) {
//			throw new Exception("Nome invalido.");
//		}
//		// Verifica se ha caracteres que nao sao digitos no rg
//		if (contaDigitos(rg) < rg.length()) {
//			throw new Exception("RG invalido.");
//		}

        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Pessoa(String nome, String cnpj) throws Exception {

//		// Verifica autenticidade do cnpj
//		if (!verificaCNPJ(cnpj)) {
//			throw new Exception("CNPJ invalido.");
//		}
//		// Verifica se o nome eh valido
//		if (existeDigito(nome)) {
//			throw new Exception("Nome invalido.");
//		}

        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
//		// Verifica autenticidade do cpf
//		if (!verificaCPF(cpf)) {
//			throw new Exception("CPF invalido.");
//		}

        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) throws Exception {
//		// Verifica se ha caracteres que nao sao digitos no rg
//		if (contaDigitos(rg) < rg.length()) {
//			throw new Exception("RG invalido.");
//		}

        this.rg = rg;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) throws Exception {
//		// Verifica autenticidade do cnpj
//		if (!verificaCNPJ(cnpj)) {
//			throw new Exception("CNPJ invalido.");
//		}

        this.cnpj = cnpj;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) throws Exception {
//		// Verifica se o nome eh valido
//		if (existeDigito(nome)) {
//			throw new Exception("Nome invalido.");
//		}

        this.nome = nome;
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
    private static int contaDigitos(String numero) {
        int contador = 0;
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) >= '0' && numero.charAt(i) <= '9') {
                contador++;
            }
        }
        return contador;
    }

    // Metodo que verifica se um CPF eh valido a partir da formacao dos dois
    // ultimos digitos
    private boolean verificaCPF(String cpf) {

        int decimo, decimoPrimeiro, soma = 0, mult = 10, resto;
        int cpfInt[] = new int[11];

        if (cpf.length() < 11 || cpf.length() > 11 || contaDigitos(cpf) < 11) {
            return false;
        }

        for (int i = 0; i < 11; i++) {
            cpfInt[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }

        // Verifica decimo digito
        for (int i = 0; i < 9; i++) {
            soma += (mult * cpfInt[i]);
            mult--;
        }

        resto = soma % 11;
        decimo = (resto == 0 || resto == 1) ? 0 : 11 - resto;

        if (decimo == cpfInt[9]) {

            mult = 11;
            soma = 0;

            // Verifica o decimo-primeiro digito
            for (int i = 0; i < 10; i++) {
                soma += (mult * cpfInt[i]);
                mult--;
            }

            resto = soma % 11;
            decimoPrimeiro = (resto == 0 || resto == 1) ? 0 : 11 - resto;

            if (decimoPrimeiro == cpfInt[10]) {
                return true;
            }

        }

        return false;
    }

    // Metodo que verifica se um CNPJ eh valido a partir da formacao dos dois
    // ultimos digitos
    private boolean verificaCNPJ(String cnpj) {

        int decimoTerceiro, decimoQuarto, soma = 0, mult = 5, resto;
        int cnpjInt[] = new int[14];

        if (cnpj.length() < 14 || cnpj.length() > 14 || contaDigitos(cnpj) < 14) {
            return false;
        }

        for (int i = 0; i < 14; i++) {
            cnpjInt[i] = Integer.parseInt(String.valueOf(cnpj.charAt(i)));
        }

        // Verifica decimo-terceiro digito
        for (int i = 0; i < 12; i++) {
            // System.out.println(mult);
            soma += (mult * cnpjInt[i]);
            mult--;
            mult = mult < 2 ? 9 : mult;
        }

        resto = soma % 11;
        decimoTerceiro = (resto == 0 || resto == 1) ? 0 : 11 - resto;

        if (decimoTerceiro == cnpjInt[12]) {

            mult = 6;
            soma = 0;

            // Verifica o decimo-quarto digito
            for (int i = 0; i < 13; i++) {
                soma += (mult * cnpjInt[i]);
                mult--;
                mult = mult < 2 ? 9 : mult;
            }

            resto = soma % 11;
            decimoQuarto = (resto == 0 || resto == 1) ? 0 : 11 - resto;

            if (decimoQuarto == cnpjInt[13]) {
                return true;
            }
        }

        return false;
    }
}
