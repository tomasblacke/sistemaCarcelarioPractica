package org.example.Reclusos;

import java.time.LocalDate;

public abstract class Reclusos {
    private  int id=0;
    private static int contadorID=0;
    private String nombre;
    private String apellido;
    private int edad;
    private String motivo;
    private int condena;
    public enum clase{
        minima,
        media,
        maxima;
    }
    private LocalDate fehcaIngreso;
    //private clase seguridad;

    public Reclusos(String nombre, String apellido, int edad, String motivo, int condena) {
        this.id = contadorID++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.motivo = motivo;
        this.condena = condena;
        //this.seguridad = seguridad;
        this.fehcaIngreso = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getCondena() {
        return condena;
    }

    public void setCondena(int condena) {
        this.condena = condena;
    }

    public LocalDate getFehcaIngreso() {
        return fehcaIngreso;
    }

    public void setFehcaIngreso(LocalDate fehcaIngreso) {
        this.fehcaIngreso = fehcaIngreso;
    }

    public int getId() {
        return id;
    }



    /*
        public clase getSeguridad() {
            return seguridad;
        }

        public void setSeguridad(clase seguridad) {
            this.seguridad = seguridad;
        }

    */
    public void mostrarReclusos(){
        System.out.println("========================");
        System.out.println("ID:"+this.id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Motivo: "+motivo);
        System.out.println("Condena: "+condena+" anios");
        System.out.println("Fecha de ingreso: "+fehcaIngreso);

    }
}
