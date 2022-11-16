/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

       
/**
 *
 * @author Usuario PC
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double costoKwHora;
        double numKw;
        double subTotal;
        double descuento=0.0;
        double total;
        int edad;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la edad:");
        edad = sc.nextInt();
        System.out.print("Ingrese el costo del Kw:");
        costoKwHora = sc.nextDouble();
        System.out.print("Ingrese el numero de Kw:");
        numKw = sc.nextDouble();
        
        subTotal = costoKwHora * numKw;
        if(edad > 65){
            descuento = subTotal * 0.10;
        }
        total= subTotal - descuento;
        System.out.println("El total a pagar es: " + total);
        
    }
    
}
