/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Usuario PC
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String descripcion;
        double precioUnitario;
        int cantidad;
        double descuento=0.0;
        double total;
          
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la descripcion del producto");
        descripcion = entrada.nextLine();
        System.out.println("Ingrese el precio unitario");
        precioUnitario = entrada.nextDouble();
        System.out.print("Ingrese la cantidad:");
        cantidad = entrada.nextInt();
      
        double subTotal = precioUnitario * cantidad;
        if(cantidad > 50){
            descuento = subTotal * 0.15;
        }
        total = subTotal - descuento;
        
        System.out.printf("%s total a pagar es: %.2f", descripcion, 
                total);
        
                
    }
    
}
