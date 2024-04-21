package org.example.Reclusos;

public class MinimaSeguridad extends Reclusos{
    private String grado;
    public MinimaSeguridad(String nombre, String apellido, int edad, String motivo, int condena) {
        super(nombre, apellido, edad, motivo, condena);
        this.grado="Minima";
    }
    public void mostrarReclusos(){
        super.mostrarReclusos();
        System.out.println("Grado: " + this.grado);
    }
}
