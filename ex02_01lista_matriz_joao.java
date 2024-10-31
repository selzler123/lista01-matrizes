package matriz;

import java.util.Scanner;

public class ex02_01lista_matriz_joao {
    public static void main(String[] args){
        
        int [][] numeros = new int [3][4];
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros.length; j++){
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i,j);
                numeros [i][j] = s.nextInt();
            }
        }
        System.out.println("A matriz inserida é:");
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros.length; j++){
                System.out.println(numeros[i][j] + "");
            }
        }
        System.out.println("");
    }
}
