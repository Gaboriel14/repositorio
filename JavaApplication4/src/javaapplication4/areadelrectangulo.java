/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author compu
 */
public class areadelrectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Ingrese la longitud del rectangulo:");
        double longitud = scanner.nextDouble();
        
        System.out.print("Ingrese el ancho del rectangulo:");
        double ancho = scanner.nextDouble();
        
        double area = longitud * ancho;
        
        System.out.printf("El area del rectangulo es: %.2f%n",area);
        scanner.close();
        
                
        // TODO code application logic here
    }
    
}