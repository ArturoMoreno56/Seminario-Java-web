 
package com.arturo.arturo;


public class App1 {
    public static void main(String[] args) {
        double longitud = 11.3;
        double ancho = 3.2;
        
        double perimetro = 2 * (longitud + ancho);
        double area = longitud * ancho;

        System.out.println("Calculo del perimetro y el area de un rectangulo:");

        System.out.println("Longitud: "+longitud+ " m");

        System.out.println("Ancho: "+ancho +" m");

        System.out.println("Perimetro: " + perimetro + " m");
        System.out.println("Area: " + area + " m**2");
    }
}
