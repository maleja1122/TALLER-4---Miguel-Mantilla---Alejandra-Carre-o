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
public class ejercicio18 {

    /**
     * 18.Realizar un algoritmo que calcule el salarioa pagarde un empleado 
     * según los siguientes parámetros: •Si gana menos de 700.000, 
     * descuento de pensión =-2%, descuento de salud =-4% 
     * y más Aux.de transporte= +11%. •Si gana entre 741.000 y 999.999, descuento de pensión =-4%,
 descuento de salud =-6% y más Aux. de transporte= +9%.
 •Si gana más 1.000.000y menos 1.800.00, descuento por pensión es -6%, 
 descuento de segurode vida 5%, descuento de salud =-6% y más Aux. de transporte= +9%.
 •Si gana más de 1.800.000 y menos de 2.500.00, descuento por pensión es -6%, 
 descuento de seguro de vida 5%, descuento de salud =-8% y más Aux. de transporte= +8%.
 •Si gana más de 2.500.000, descuento por pensión es -8%, descuento de seguro de vida 6%,
 descuento de salud =-10% y más Aux. de transporte= +9%.
     * @param args
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        long  salario;
        float descuentoPension;
        float descuentoSalud;
        float auxDeTransporte;
        float descuentoSeguroDeVida;
	System.out.println("Ingrese el salario a pagar");
	salario = (long) read.nextFloat();
	if(salario <= 700000){
	    descuentoPension =(float) 0.02;
	    descuentoSalud = (float) 0.04;
	    auxDeTransporte =(float) 0.11; 
	    descuentoPension = (float) (salario*descuentoPension);
	    descuentoSalud = (float) (salario*descuentoSalud);
	    auxDeTransporte = (float) (salario*auxDeTransporte);
            salario = (long) ((salario)+(auxDeTransporte-descuentoSalud-descuentoPension));
            System.out.println("La persona Gano: $"+salario);
	}
        else if((salario >= 741000) || (salario <= 999999)){    
	    descuentoPension =(float) 0.04;
	    descuentoSalud = (float) 0.06;
	    auxDeTransporte =(float) 0.09;
	    
	    descuentoPension = (float) (salario*descuentoPension);
	    descuentoSalud = (float) (salario*descuentoSalud);
	    auxDeTransporte = (float) (salario*auxDeTransporte);
            salario = (long) ((salario)+(auxDeTransporte-descuentoSalud-descuentoPension));
            System.out.println("La persona Gano: $"+salario);
	}
        else if((salario <= 1800000) || (salario >= 1000000)){
	    
	    descuentoPension = (float) 0.06;
	    descuentoSalud = (float) 0.06;
	    auxDeTransporte =(float) 0.09;
	    descuentoSeguroDeVida = (float) 0.05;
	    
	    descuentoPension = (float) (salario*descuentoPension);
	    descuentoSalud = (float) (salario*descuentoSalud);
	    auxDeTransporte = (float) (salario*auxDeTransporte);
	    descuentoSeguroDeVida = (float) (salario*descuentoSeguroDeVida);
            salario = (long) ((salario)+(auxDeTransporte-descuentoSalud-descuentoPension-descuentoSeguroDeVida));
	    System.out.println("La persona Gano: $"+salario);
        }
        else if((salario >= 1800000) || (salario <= 2500000)){
	    
	    descuentoPension = (float) 0.06;
	    descuentoSalud = (float) 0.08;
	    auxDeTransporte =(float) 0.08;
	    descuentoSeguroDeVida = (float) 0.05;
	    
	    descuentoPension = (float) (salario*descuentoPension);
	    descuentoSalud = (float) (salario*descuentoSalud);
	    auxDeTransporte = (float) (salario*auxDeTransporte);
	    descuentoSeguroDeVida = (float) (salario*descuentoSeguroDeVida);
            salario = (long) ((salario)+(auxDeTransporte-descuentoSalud-descuentoPension-descuentoSeguroDeVida));
            System.out.println("La persona Gano: $"+salario);
        }
        else if(salario > 2500000){
	    
	    descuentoPension = (float) 0.08;
	    descuentoSalud = (float) 0.10;
	    auxDeTransporte =(float) 0.09;
	    descuentoSeguroDeVida = (float) 0.05;
	    
	    descuentoPension = (float) (salario*descuentoPension);
	    descuentoSalud = (float) (salario*descuentoSalud);
	    auxDeTransporte = (float) (salario*auxDeTransporte);
	    descuentoSeguroDeVida = (float) (salario*descuentoSeguroDeVida);
            salario = (long) ((salario)+(auxDeTransporte-descuentoSalud-descuentoPension-descuentoSeguroDeVida));
            System.out.println("La persona Gano: $"+salario);
        }
    }
}