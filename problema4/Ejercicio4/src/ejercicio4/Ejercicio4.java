/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Usuario PC
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numeroDias;
        double costoDiario;
        double subTotal;
        double descuento=0.0;
        double total;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de dias:");
        numeroDias = sc.nextDouble();
        System.out.print("Ingrese el costo diario:");
        costoDiario = sc.nextDouble();

        subTotal = costoDiario * numeroDias;
        if(numeroDias > 5){
            descuento = subTotal * 0.10;
        }
        if(numeroDias > 10){
            descuento = subTotal * 0.15;
        }
        if(numeroDias > 15){
            descuento = subTotal * 0.20;
        }

        total= subTotal - descuento;
        System.out.printf("Subtotal:%.2f\nDescuento:%.2f\nTotal:%.2f ", subTotal, descuento, total);



    }
    
}
