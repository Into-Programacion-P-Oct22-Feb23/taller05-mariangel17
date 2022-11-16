/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Usuario ;
PC
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marcaAutomovil;
        String origenAutomovil;
        double costoAutomovil;
        double precioVenta = 0;
        double impuesto = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la marca del automovil");
        marcaAutomovil = entrada.nextLine();
        System.out.println("Ingrese el origen del automovil");
        origenAutomovil = entrada.nextLine();
        System.out.println("Ingrese el costo del automovil");
        costoAutomovil = entrada.nextDouble();
        
        if(origenAutomovil.equals("Alemania")){
            impuesto = costoAutomovil * 0.20;
        }
        if(origenAutomovil.equals("Japon")){
            impuesto = costoAutomovil * 0.30;
        }
        if(origenAutomovil.equals("Italia")){
            impuesto = costoAutomovil * 0.15;
        }
        if(origenAutomovil.equals("Usa")){
            impuesto= costoAutomovil * 0.08;
        }

        System.out.printf("El impuesto por pagar es: %.2f\n El precio de venta es %.2f", impuesto, precioVenta);

    }
    
}
