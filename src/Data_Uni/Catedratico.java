/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Uni;

/**
 *
 * @author CESAR
 */
public class Catedratico extends Persona
{
    private int codigo;
    private int codcurso;
    private String genero;
    private float sueldo;

    public Catedratico(String nombre, String apellido, int edad, int codigo, int codcurso,String genero, float sueldo ) {
        super(nombre, apellido, edad);
        this.codigo = codigo;
        this.codcurso = codcurso;
        this.genero = genero;
        this.sueldo = sueldo;
    }
       public String getAtributos()
    {
        return super.getdatos() + "\nCodigo: " + codigo + " \nCodigo del curso "+ codcurso + " \nGenero: " + genero + " \nSueldo : "+ sueldo + " ";
    }
}