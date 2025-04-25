 
package com.arturo.arturo;
import java.util.Scanner;
public class App4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

         int n=0;

            try {
                System.out.println("Ingresa un numero para saber su tabla de multiplicar : ");
                n=entrada.nextInt();

                for (int i = 1; i < 11; i++) {
                    System.out.println(n+" * "+i+" = "+(n*i));
                }
            } catch (Exception e) {
                System.out.println("Ha ingreado algo incorrecto");
            }
    }
    
}
