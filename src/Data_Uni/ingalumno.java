package Data_Uni;

import java.util.Scanner;

/**
 *
 * @author CESAR
 */
public class ingalumno {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombre1;
        String apellido1;
        int edad1;
        int codigo1;
        int cantidadcurso;
        String genero1;
       


        Scanner teclado = new Scanner(System.in);

        System.out.print("Ing. el nombre del alumno: ");
        nombre1 = teclado.nextLine();

        System.out.print("Ing. el apellido del alumno: ");
        apellido1 = teclado.nextLine();
        System.out.print("Ing. el genero: ");
        genero1 = teclado.nextLine();
        System.out.print("Ing. la edad: ");
        edad1 = teclado.nextInt();
        System.out.print("Ing. el codigo de alumno: ");
        codigo1 = teclado.nextInt();
         System.out.print("Ing. numero de cursos activos: ");
        cantidadcurso = teclado.nextInt();
        
        

        Alumno newalumno = new Alumno(nombre1, apellido1, edad1, codigo1, cantidadcurso, genero1);

        System.out.printf(newalumno.getAtributos());
    }
    
}