
 
package com.arturo.arturo;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        
        int n=0;

        Scanner texto = new Scanner(System.in);

        System.out.println("Ingresa un numero");
       
        try {
                                                                     
        n=texto.nextInt();

        if (n%2==0) {
            System.out.println("El numero ingresado es par");
        }
        else{
            System.out.println("EL numero ingresado es impar");
        }
        } catch (Exception e) {
          System.out.println("ha ocurrido un error o no ha ingresado un valor adecuados");
        }
    }
}
