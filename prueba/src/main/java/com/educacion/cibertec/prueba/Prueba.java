/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.educacion.cibertec.prueba;

import java.math.BigDecimal;

/**
 *
 * @author Jorge Achulla
 */
public class Prueba {

    public static void main(String[] args) {
        System.out.println("Hello World!- -> Java Fundamentals---");
        
      int x = 20;
      int y = 80;   
      int resultado;
      int edad= 20;
      boolean esMayor=true;
      
        resultado = x+y;
        System.out.println("Se procede a realizar la operacion con X:");
        System.out.println("La suma es: " + resultado);
        resultado = y-x;
        System.out.println("La resta es:" + resultado);
        resultado = x*y;
        System.out.println("La Multiplicacion es: " + resultado);
        resultado = y/x;
        System.out.println("La Division es: " + resultado);
        
        
        System.out.println("El empleado x es mayor de edad: " + esMayor);
        
        boolean comprueba = !esMayor;
        System.out.println("el empleado x en una sigueinte es mayor de edad: " + comprueba);
     
        boolean eva1=true;
        boolean eva2 = true;
        boolean evaFinal = eva1 && eva2;
        System.out.println("Evaluacion final es: " + evaFinal);
        
    }
    
    
    public static int mostrarPerimetro(int lado) {
        int perimetro;
        perimetro = 4*lado;
        return perimetro;
    }
}
