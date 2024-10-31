package matriz;

import java.util.Random;

public class ex04_01lista_matriz_joao {
     public static void main(String[] args){
         
         int [][] numeros = new int [5][4];
         Random r = new Random();
         
         for (int i = 0; i < numeros.length; i++){
             for (int j = 0; j < numeros[i].length; j++){
                 numeros[i][j] = r.nextInt(10 , 11);
                 System.out.println("Os numeros gerados foram: " + numeros[i][j]);
             }
         }
            
          for (int i = 0; i < numeros.length; i++) {
            int soma = 0;
            for (int j = 0; j < numeros[i].length; j++) {
                soma += numeros[i][j];
            }
               System.out.printf("Linha %d: Soma: %d%n", i, soma);
          }
          
     }
}
