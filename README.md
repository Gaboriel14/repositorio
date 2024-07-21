package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author macia
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su indice de Masa corporal(IMC)");
        System.out.print("-----------------------------");
        
        System.out.print("Ingrese su peso en kilogramos");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese su altura en metros");
        double altura = scanner.nextDouble();
        
        double imc = calcularIMC (peso, altura);
        
        System.out.printf(""
                + "%nTu´indice de masa corporal(IMC)es:%.2f%n",imc);
        
        scanner.close();
    }
    
    public static double calcularIMC(double peso,double altura){
        return peso/(altura*altura);
    }
}
