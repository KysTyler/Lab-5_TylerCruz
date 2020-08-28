/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_tylercruz;

/**
 *
 * @author Tyler C
 */
public class Persona {
    //Nacionalidad, Nombre, Apellido, Edad, Género, Vocación, Si tiene o no título universitario y si tiene Coronavirus o no
    private String nacionalidad;
    private String name;
    private String apellido;
    private int edad;
    private String genero;
    private String vocacion;
    private boolean tituloU;
    private boolean virus;

    public Persona() {
    }

    public Persona(String nacionalidad, String name, String apellido, int edad, String genero, String vocacion, boolean tituloU, boolean virus) {
        this.nacionalidad = nacionalidad;
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.vocacion = vocacion;
        this.tituloU = tituloU;
        this.virus = virus;
    }

    public Persona(String nacionalidad, String name,String apellido, int edad) {
        this.nacionalidad = nacionalidad;
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }

    public boolean isTituloU() {
        return tituloU;
    }

    public void setTituloU(boolean tituloU) {
        this.tituloU = tituloU;
    }

    public boolean isVirus() {
        return virus;
    }

    public void setVirus(boolean virus) {
        this.virus = virus;
    }

    @Override
    public String toString() {
        return name + " " + apellido;
    }
    

    
}
