public class Colaborador {
    // Variáveis
    public double salario,porcentagem, aumentoporcento,aumentoporcentagem, dinhfinal;

    // Métodos
    public double aumentoporcentagem() {
   if (salario <= 280){
    aumentoporcento = 20;
   }
   else if (salario >= 280 && salario <= 700){
    aumentoporcento = 15;
   }
   else if (salario >= 700 && salario <= 1500){
    aumentoporcento = 10;
   }
   else {
    aumentoporcento = 5;
   }

porcentagem = (salario * aumentoporcento) / 100;
dinhfinal = (salario + porcentagem);

   return aumentoporcentagem;
}// aumentoporcentagem


public void resultado(){
  aumentoporcentagem();
    
  System.out.println("Seu Salario Agora E De:"+ dinhfinal);
  System.out.println("Seu Salario Era De:" + salario);
  System.out.println("Seu Aumento Foi De:" + aumentoporcento + "Porcento");
  System.out.println("Seu Salario Aumentou:" + porcentagem);

}




}