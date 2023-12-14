import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        FolhaDePagamentoCalculadora input = new FolhaDePagamentoCalculadora(System.in);

        // Solicitar o valor da hora e a quantidade de horas trabalhadas
        System.out.print("Informe o valor da hora: ");
        double valorHora = input.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = input.nextInt();

        FolhaDePagamentoCalculadora calculadora = new FolhaDePagamentoCalculadora();
        calculadora.calcularFolhaDePagamento(valorHora, horasTrabalhadas);

        input.close();
    }
}

