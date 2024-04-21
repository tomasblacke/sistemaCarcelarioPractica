package org.example.Actividades;

public class Actividades {
    private int id=0;//identifica la atividad
    private String nombre;
    private boolean supervisada;
    private static int contadorActividades=0;

    public Actividades(String nombre, boolean supervisada) {
        this.id=++contadorActividades;
        this.nombre = nombre;
        this.supervisada = supervisada;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSupervisada() {
        return supervisada;
    }

    public void setSupervisada(boolean supervisada) {
        this.supervisada = supervisada;
    }
    public void mostrarActividad(){
        System.out.println("===========================");
        System.out.println(id);
        System.out.println("Atividad:"+nombre);
        System.out.println("Supervisada:"+supervisada);
    }

}
