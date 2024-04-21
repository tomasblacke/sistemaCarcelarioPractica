package org.example.Personal;

public class Guardia extends Personal{
    private String puesto;
    private boolean disponible;

    public Guardia(String nombre, String legajo, String apellido, String puesto) {
        super(nombre, legajo, apellido);
        this.puesto = puesto;
        this.disponible = true;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public void mostrarPersonal() {
        super.mostrarPersonal();
        System.out.println("Puesto: " + getPuesto());
    }
}
