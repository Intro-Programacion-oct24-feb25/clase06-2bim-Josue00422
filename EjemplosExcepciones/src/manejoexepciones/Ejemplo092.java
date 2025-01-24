/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
import java.util.Scanner;

public class Ejemplo092 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        boolean bandera = true;
        while (bandera) {
            try {
                System.out.println("ingrese el nombre del pais");
                cadena = entrada.nextLine();
                String primer_caracter = cadena.substring(0, 1);
                if (primer_caracter.equals("a") || primer_caracter.equals("z")) {
                    throw new Exception("debe ingresar el nombre del pais con "
                            + "una consonante inicial ");

                }
                 bandera = false;
               
            } catch (Exception e) {
                System.out.printf("ocurrio un error %s\n", e);

            }
        }
        System.out.printf("%S\n", cadena);
    }

}
