package Etapa4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar a quebra de linha

            if (opcao == 1) {
                // Criar uma loja
                System.out.print("Informe o nome da loja: ");
                String nomeLoja = scanner.nextLine();

                System.out.print("Informe a quantidade de funcionários: ");
                int quantidadeFuncionarios = scanner.nextInt();

                System.out.print("Informe o salário base dos funcionários: ");
                double salarioBaseFuncionario = scanner.nextDouble();

                // Crie o objeto Loja
                loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, null, null);

                System.out.println("Loja criada com sucesso!");
            } else if (opcao == 2) {
                // Criar um produto
                System.out.print("Informe o nome do produto: ");
                String nomeProduto = scanner.nextLine();

                System.out.print("Informe o preço do produto: ");
                double precoProduto = scanner.nextDouble();

                System.out.print("Informe a data de validade do produto (dia mês ano): ");
                int dia = scanner.nextInt();
                int mes = scanner.nextInt();
                int ano = scanner.nextInt();

                // Crie o objeto Data para a data de validade
                Data dataValidade = new Data(dia, mes, ano);

                // Crie o objeto Produto
                produto = new Produto(nomeProduto, precoProduto, dataValidade);

                System.out.println("Produto criado com sucesso!");
            } else if (opcao == 3) {
                // Sair do programa
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        if (produto != null) {
            Data dataDeVerificacao = new Data(20, 10, 2023);
            boolean vencido = produto.estaVencido(dataDeVerificacao);

            if (vencido) {
                System.out.println("PRODUTO VENCIDO");
            } else {
                System.out.println("PRODUTO NÃO VENCIDO");
            }
        }

        if (loja != null) {
            System.out.println("Informações da Loja:");
            System.out.println(loja.toString());
        }
    }
}

