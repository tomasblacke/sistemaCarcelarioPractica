package org.example.Reclusos;

public class MediaSeguridad extends Reclusos{
    private String grado;
    public MediaSeguridad(String nombre, String apellido, int edad, String motivo, int condena) {
        super(nombre, apellido, edad, motivo, condena);
        this.grado="Media";
    }

    @Override
    public void mostrarReclusos() {
        super.mostrarReclusos();
        System.out.println("Grado: " + grado);
    }
}
