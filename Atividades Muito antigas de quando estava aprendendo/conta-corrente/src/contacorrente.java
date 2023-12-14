public class contacorrente {
    public static void main(String[] args) throws Exception {
        ContaCorrent conta = new ContaCorrent();
        
        conta.depositar(1000);
        System.out.println("Saldo: " + conta.getSaldo());
        
        conta.sacar(200);
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
