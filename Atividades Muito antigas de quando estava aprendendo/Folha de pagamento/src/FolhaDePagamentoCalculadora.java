class FolhaDePagamentoCalculadora {
    public void calcularFolhaDePagamento(double valorHora, int horasTrabalhadas) {
        // Calcular o salário bruto
        double salarioBruto = valorHora * horasTrabalhadas;

        // Calcular o desconto do IR
        double descontoIR = 0;
        if (salarioBruto <= 900) {
            descontoIR = 0;
        } else if (salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.1;
        } else {
            descontoIR = salarioBruto * 0.2;
        }

        // Calcular o desconto do INSS (10%)
        double descontoINSS = salarioBruto * 0.1;

        // Calcular o FGTS (11%)
        double fgts = salarioBruto * 0.11;

        // Calcular o total de descontos
        double totalDescontos = descontoIR + descontoINSS;

        // Calcular o salário líquido
        double salarioLiquido = salarioBruto - totalDescontos;

        // Imprimir os resultados
        System.out.println("Salário bruto (" + valorHora + " * " + horasTrabalhadas + "): R$ " + salarioBruto);
        System.out.println("( - ) IR (5%): R$ " + descontoIR);
        System.out.println("( - ) INSS (10%): R$ " + descontoINSS);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}