/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Taller4 {

    /**
     *15.Realizar un programaque calcule el valor a pagar por algunos galones de 
     * gasolina si sabemos que cada litro de gasolina vale 
     * 9.500.Imprimir la cantidad de galones, 
     * precio por galón, cantidad de litros y precio a pagar.
     * @param args
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int precioLitro;
        float cantGalon;
        float cantLitros;
        float precioGalon;
        float precio;
        precioLitro = 9500;
        precioGalon = (float) (9500*3.785);
        // 1 galon = 3.785 Litros
        
        System.out.println("Cuantos galones desea tanquear");
        cantGalon = read.nextFloat();
        cantLitros = (float) (cantGalon * 3.785);
        precio = (cantGalon*precioGalon);
        System.out.println("Los galones que usted desea tanquear son: "+cantGalon);
        System.out.println("La cantidad en litros es: "+cantLitros);
        System.out.println("El precio por litro es: $"+precioLitro);
        System.out.println("Debe pagar: $"+precio);    
    }
}
