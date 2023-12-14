
    
    public class ContaCorrent {
        private double saldo;
        
        public ContaCorrent() {
            saldo = 0.0;
        }
        
        public double getSaldo() {
            return saldo;
        }
        
        public void depositar(double quantia) {
            if (quantia > 0) {
                saldo += quantia;
                System.out.println("Depósito de " + quantia + " realizado com sucesso.");
            } else {
                System.out.println("Valor inválido para depósito.");
            }
        }
        
        public void sacar(double quantia) {
            double taxa = quantia * 0.005; // Taxa de 0,5% do valor sacado
            
            if (quantia > 0 && quantia + taxa <= saldo) {
                saldo -= (quantia + taxa);
                System.out.println("Saque de " + quantia + " realizado com sucesso. Taxa de operação: " + taxa);
            } else {
                System.out.println("Saldo insuficiente ou valor inválido para saque.");
            }
        }
    }
    





