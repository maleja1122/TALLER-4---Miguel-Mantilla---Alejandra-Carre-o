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
public class ejercicio16 {

    /**
     *16.Dada las horas trabajadas por un empleado determinar cuántogana semanalmentey mensualmente, 
     * si el trabajador debe trabajar mínimo 38h semanales y un máximo de 56h.Se debe pedir la cantidad de horas trabajadas y verificar que esté dentro del rango permitido, 
 también se debe pedir el precio de la hora.  
     * Imprimir la cantidad de horas trabajadas y el pago
     * @param args
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double precioHora;
        double horasTrabajadas;
        double pago;
        double pagoSemana;
        double horasTrabajadasMes;
        
        System.out.println("Cuanto se paga la hora en la empresa");
        precioHora = read.nextDouble();
        System.out.println("Cuantas horas trabajo");
        horasTrabajadas = read.nextDouble();
        while ((horasTrabajadas > 56) || (horasTrabajadas < 38)){
        System.out.println("Cuantas horas trabajo");
        horasTrabajadas = read.nextDouble();
        }
        horasTrabajadasMes = (horasTrabajadas*4);
        pagoSemana = (double) (precioHora*horasTrabajadas);
        System.out.println("Esta semana el trabajador gano: $"+pagoSemana);
        pago = (double) (precioHora*horasTrabajadasMes);
        System.out.println("Este mes el trabajador gano: $"+pago);
    }
}
