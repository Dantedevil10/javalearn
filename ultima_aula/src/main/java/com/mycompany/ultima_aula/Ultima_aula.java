

package com.mycompany.ultima_aula;


public class Ultima_aula {

    public static void main(String[] args) {
        retangulo r = new retangulo();
        quadrado q = new quadrado();
        triangulo t = new triangulo();
       resultado(r);
       resultado(q);
       resultado(t);
    }
    static void resultado(retangulo x){
        System.out.println(x.calc());
    }
}
