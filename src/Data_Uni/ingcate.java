/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Uni;

import java.util.Scanner;

/**
 *
 * @author CESAR
 */
public class ingcate {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombre1;
        String apellido1;
        int edad1;
        int codigo1;
        int codigocurso;
        String genero1;
        float sueldo1;


        Scanner teclado = new Scanner(System.in);

        System.out.print("Ing. el nombre del catedratico: ");
        nombre1 = teclado.nextLine();

        System.out.print("Ing. el apellido del ecatedratico: ");
        apellido1 = teclado.nextLine();
        System.out.print("Ing. el genero(M masculino/ F femenino): ");
        genero1 = teclado.nextLine();
        System.out.print("Ing. la edad: ");
        edad1 = teclado.nextInt();
        System.out.print("Ing. el codigo de catedratico: ");
        codigo1 = teclado.nextInt();
         System.out.print("Ing. el codigo de curso: ");
        codigocurso = teclado.nextInt();
         System.out.print("Ing. el sueldo del catedratico: ");
        sueldo1 = teclado.nextFloat();
        

        Catedratico newcatedratico = new Catedratico(nombre1, apellido1, edad1, codigo1, codigocurso, genero1, sueldo1);

        System.out.printf(newcatedratico.getAtributos());
    }
    
}