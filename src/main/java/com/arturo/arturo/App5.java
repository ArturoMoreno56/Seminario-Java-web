 
package com.arturo.arturo;
import java.util.Scanner;
public class App5 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        int n=0;

            try {
                
        System.out.println("Ingrese un dia de la semana segun corresponda");
        System.out.println("1 lunes , 2 martes ,3 miercoles, 4 jueves, 5 viernes ,6 sabado ,7 Domingo");
        n=entrada.nextInt();

        switch (n) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
            default:
                System.out.println("Rango invalido");
                break;
        }
            } catch (Exception e) {
               System.out.println("Se ingreso algo erroneo");
            }

    }
}