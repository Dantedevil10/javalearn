public class hipotenusaecatetos {


double a ,b ,conta;

//metodos    
public double catetos(){

conta = (a*a) + (b*b);
return conta;
}//catetos


public void hipotenusa(){
catetos();

double resultado;

resultado = Math. sqrt(catetos());
System.out.println(resultado);
}





}
