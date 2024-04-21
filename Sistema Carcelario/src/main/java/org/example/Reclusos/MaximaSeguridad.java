package org.example.Reclusos;

public class MaximaSeguridad extends Reclusos{
    private String grado;
    public MaximaSeguridad(String nombre, String apellido, int edad, String motivo, int condena) {
        super(nombre, apellido, edad, motivo, condena);
        this.grado = "Maxima";

    }

    @Override
    public void mostrarReclusos() {
        super.mostrarReclusos();
        System.out.println("Grado: " + grado);
    }
}
