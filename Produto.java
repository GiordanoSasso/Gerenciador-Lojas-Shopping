package Etapa4;

public class Produto {
    private String nome;
    private double preco;
    private Data dataDeValidade;

    public Produto(String nome, double preco, Data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(Data dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return "Nome do Produto: " + nome +
               "\nPreço: R$" + preco +
               "\nData de Validade: " + dataDeValidade;
    }

        
    public boolean estaVencido(Data dataAtual) {
        return dataAtual.compareTo(dataDeValidade) <= 0;
    }
    

    public static void main(String[] args) {
        Data dataValidade1 = new Data(31, 12, 2023);
        Data dataValidade2 = new Data(15, 6, 2024);
        Produto produto1 = new Produto("Camiseta", 29.99, dataValidade1);
        Produto produto2 = new Produto("Tênis", 79.99, dataValidade2);

        System.out.println(produto1.toString());
        System.out.println("Está Vencido (hoje é 01/01/2024): " + produto1.estaVencido(new Data(1, 1, 2024)));
        System.out.println("Está Vencido (hoje é 01/01/2023): " + produto1.estaVencido(new Data(1, 1, 2023)));

        System.out.println(produto2.toString());
        System.out.println("Está Vencido (hoje é 01/01/2024): " + produto2.estaVencido(new Data(1, 1, 2024)));
    }
}

