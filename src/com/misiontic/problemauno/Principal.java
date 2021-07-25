/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.problemauno;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public class Principal {

    /*
    1. pedir el número al usuario. Leer consola x
    2. validar rango x
    3. generar tabla del 1 al 100 en base al número ingresado  x
    4. validar impares.
    5. terminar. 

     */
    private static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = menu();

        System.out.println("tu número es: " + opcion);

        System.out.println("Tu tabla será la del número: " + opcion);
        
        
        int cantidadImpares =  multiplicacion(opcion);
        System.out.println("Cantidad de impares: " +cantidadImpares);

    }

    public static int multiplicacion(int opcion) {

        //ultima//   NO;       ; 2          ; 1      
// otras //  NO;       ; 2          ; 1     
//1 time //  1          ; 2         ; 3
        //   init     ; condición; incrementación 
        int contadorImpares = 0;
        for (int i = 1; i <= 100; i = i + 1) {
            System.out.println(opcion + " x " + i + " = " + opcion * i);

            if ((opcion * i) % 2 == 1) {
                contadorImpares++;
            }
        }
        
        return contadorImpares;
    }

    private static int menu() {
        int opcion;

        do {
            System.out.println("Ingrese un número >1 y <9: ");//2
            opcion = lector.nextInt();//10

        } while (!(opcion > 1 && opcion < 9)); // !(true Y true) = false

        return opcion;
    }

}
