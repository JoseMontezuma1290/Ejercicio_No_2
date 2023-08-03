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
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombre1;
        String apellido1;
        int edad1;
        int codigo1;
        String puesto1;
        String genero1;
        float sueldo1;


        Scanner teclado = new Scanner(System.in);

        System.out.print("Ing. el nombre del empleado: ");
        nombre1 = teclado.nextLine();

        System.out.print("Ing. el apellido del empleado: ");
        apellido1 = teclado.nextLine();
        System.out.print("Ing. el puesto del empleado: ");
        puesto1 = teclado.nextLine();
        System.out.print("Ing. el genero(M masculino / F feminino): ");
        genero1 = teclado.nextLine();
        System.out.print("Ing. la edad: ");
        edad1 = teclado.nextInt();
        System.out.print("Ing. el codigo de empleado: ");
        codigo1 = teclado.nextInt();
        
        System.out.print("Ing. el sueldo del empleado: ");
        sueldo1 = teclado.nextFloat();
        

        Empleadoadm Empleado = new Empleadoadm(nombre1, apellido1, edad1, codigo1, puesto1, genero1, sueldo1);

        System.out.printf(Empleado.getAtributos());
    }
    
}
