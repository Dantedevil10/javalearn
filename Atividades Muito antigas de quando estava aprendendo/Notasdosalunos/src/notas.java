public class notas {
//variaveis
double nota1,nota2,media;

//metodos
public double calculodamedia(){

media = (nota1 + nota2) / 2;
return media;

}//calculodamedia

public void resultado(){
calculodamedia();

if (media >= 7) {
 System.out.println("Aprovado");   
}//if
else {
System.out.println("Reprovado");
}//else
if (media >= 10){
    System.out.println("Aprovado com Distincao");
}

}//resultado











    
}
