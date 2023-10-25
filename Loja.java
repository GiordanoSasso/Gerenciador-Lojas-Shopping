package Etapa4;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataDeFundacao;
    private String tipo;
    private Produto[] estoqueProdutos; // Novo atributo

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int tamanhoEstoqueProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoqueProdutos]; // Inicializa o estoque de produtos com o tamanho especificado
    }
    

     public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Loja getTipo() {
        return null;
    } 

    public Loja(String nome, int quantidadeFuncionarios, int tamanhoEstoqueProdutos) {
        this(nome, quantidadeFuncionarios, -1, new Endereco(), new Data(), tamanhoEstoqueProdutos);
    }

    public Loja(String nome2, int quantidadeFuncionarios2, double salarioBaseFuncionario2, Endereco endereco2,
            Data dataDeFundacao2) {
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataDeFundacao() {
        return dataDeFundacao;
    }

    public void setDataDeFundacao(Data dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }

    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    public void imprimeProdutos() {
        System.out.println("Produtos na Loja " + nome + ":");
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }

    public boolean insereProduto(Produto novoProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = novoProduto;
                return true; // Produto inserido com sucesso
            }
        }
        return false; // Não há espaço no estoque
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true; // Produto removido com sucesso
            }
        }
        return false; // Produto não encontrado no estoque
    }

    @Override
    public String toString() {
        // Constrói a representação em string do estoque de produtos
        String produtosString = "Estoque de Produtos:\n";
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                produtosString += produto + "\n";
            }
        }

        return "Nome: " + nome +
               "\nQuantidade de Funcionários: " + quantidadeFuncionarios +
               "\nSalário Base do Funcionário: " + salarioBaseFuncionario +
               "\nEndereço: " + endereco +
               "\nData de Fundação: " + dataDeFundacao +
               "\n" + produtosString; // Adiciona a lista de produtos ao toString
    }

    public double getValorSeguro() {
        return 0;
    }
   
}
