public class lados {
    //variaveis
public double lado1,lado2,lado3;

//metodos
public void verificacao(){ 

    if (lado1 + lado2 >= lado3) {
        System.out.println("Voce tem um triangulo");
    }
    else {
        System.out.println("Esses numeros nao compoe um triangulo");
    }
   
}//verificacao

public void tipotriangulo(){
     
      if (lado1 == lado2 && lado1 == lado3){
        System.out.println("seu triangulo e equilatero");
      }
      else if (lado1 == lado2 && lado1 != lado3){
        System.out.println("seu triangulo e isosceles");
      }
      else if (lado1 != lado2 && lado1 == lado3){
        System.out.println("seu triangulo e isosceles");
      }
      else  if (lado1 + lado2 < lado3) {
        System.out.println("");
    }
     else {
        System.out.println("seu triangulo e escaleno");
     }




}//tipodotriangulo





}








