package Etapa4;

public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    // Construtor que inicializa todos os atributos
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento) {
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Endereco() {
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    // Método toString para representação da classe como String
    @Override
    public String toString() {
        return "Endereço:\n" +
               "Rua: " + nomeDaRua + "\n" +
               "Cidade: " + cidade + "\n" +
               "Estado: " + estado + "\n" +
               "País: " + pais + "\n" +
               "CEP: " + cep + "\n" +
               "Número: " + numero + "\n" +
               "Complemento: " + complemento;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Endereco
        Endereco endereco1 = new Endereco("Aven. Santos Ferreira", "Canoas", "Rio Grande Do Sul", "Brasil", "92323-270", "54", "ao lado do posto de gasolina");
        Endereco endereco2 = new Endereco("Rua da Paz", "São Paulo", "São Paulo", "Brasil", "01000-000", "123", "Apto 402");

        System.out.println(endereco1.toString());
        System.out.println(endereco2.toString());
    }
}


