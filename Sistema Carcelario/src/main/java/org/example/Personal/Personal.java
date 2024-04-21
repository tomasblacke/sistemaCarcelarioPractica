package org.example.Personal;

public abstract class Personal {
    private String nombre;
    private String apellido;
    private String legajo;


    public Personal(String nombre, String legajo, String apellido) {
        this.nombre = nombre;

        this.legajo = legajo;
        this.apellido = apellido;
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

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    public void mostrarPersonal(){
        System.out.println("===============================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Legajo: " + legajo);
    }

}
