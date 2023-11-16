
package com.mycompany.ultima_aula;


public class quadrado extends retangulo{
       
    
        @Override
        public String calc(){
               result = Math.pow(base,2);
               return "a area do quadrado: " + result;
        }
}
