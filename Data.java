package Etapa4;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor que inicializa todos os atributos e valida a data
    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Utilizando a data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public Data() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para validar a data
    private boolean validarData(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (verificaAnoBissexto(ano) && mes == 2) {
            return dia <= 29;
        } else {
            return dia <= diasPorMes[mes];
        }
    }

    // Método para verificar se o ano é bissexto
    public boolean verificaAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Método toString para representação da classe como String
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Data
        Data data1 = new Data(29, 2, 2020);
        Data data2 = new Data(35, 6, 2022); // Data inválida

        System.out.println(data1.toString()); // Deverá imprimir "29/2/2020"
        System.out.println(data2.toString()); // Deverá imprimir "1/1/2000"
    }

    public int compareTo(Data dataDeValidade) {
        return 0;
    }

    
}
