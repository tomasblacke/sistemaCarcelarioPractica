package org.example;
import org.example.Personal.Cocinero;
import org.example.Personal.Guardia;
import org.example.Personal.Liempieza;
import org.example.Reclusos.MaximaSeguridad;
import org.example.Reclusos.MediaSeguridad;
import org.example.Reclusos.MinimaSeguridad;
import org.example.Reclusos.Reclusos;
import java.util.LinkedList;
import java.util.Scanner;

import org.example.Personal.Personal;
import org.example.Actividades.Actividades;

public class SistemaCarcelario {
    private LinkedList<Reclusos> misReclusos;
    private LinkedList<Actividades> misActividades;
    private LinkedList<Personal> misPersonal;

    public SistemaCarcelario() {
        this.misActividades = new LinkedList<>();
        this.misReclusos = new LinkedList<>();
        this.misPersonal = new LinkedList<>();
    }
///////////////////////PERSONAL/////////////////////
    public void agregarPersonal(){
    misPersonal.add(new Guardia("Pancho","G001","Picapiedra","Patio"));
    misPersonal.add(new Guardia("Luis","G002","Porto","Francotirador"));
    misPersonal.add(new Cocinero("Matias","C001","Lasagna"));
    misPersonal.add(new Liempieza("Juan","L001","Perro"));
    }
    public void mostrarPersonal(){
        System.out.println("PERSONAL:");
        for(Personal personal : misPersonal){
            personal.mostrarPersonal();
        }
    }
    public void mostrarStatus(){
        Guardia guardia=buscarGuardia();
        showGuardia(guardia);
    }
///////////////////////////RECLUSOS/////////////////////////////
    public void agregarReclusos(){
        misReclusos.add(new MinimaSeguridad("Pepe","Alvarez",26,"Asesinato bajo sustancia",5));
        misReclusos.add(new MinimaSeguridad("Rogelio","Korel",78,"Hurto",3));
        misReclusos.add(new MediaSeguridad("Luis","Mane",45,"Asesinato y Robo",5));
        misReclusos.add(new MediaSeguridad("Mario","Pol",54,"Asesinato y Robo",3));
        misReclusos.add(new MaximaSeguridad("Enrique","Solari",23,"Asesinatos Multiples",999));
        misReclusos.add(new MaximaSeguridad("Jose","Perez",65,"Asesinatos Multiples y malversacion de fondos",88));
    }
    public void mostrarReclusos(){
        System.out.println("\t RECLUSOS:");
        for(Reclusos reclusos : misReclusos){
            reclusos.mostrarReclusos();
        }
    }
    /////////////////////////ACTIVIDADES//////////////////////////
    public void agregarActividades() {
        misActividades.add(new Actividades("1-Acceso Area Comun", true));
        misActividades.add(new Actividades("2-Participacion Programas Educativos", false));
        misActividades.add(new Actividades("3-Uso Biblioteca", false));
        misActividades.add(new Actividades("4-Visita Familiares", true));
        misActividades.add(new Actividades("5-Participacion Programas de Rehabilitacion", true));
        misActividades.add(new Actividades("6-Tareas Mantenimiento", true));
    }
    public void mostrarActividades(){
        for(Actividades a: misActividades){
            a.mostrarActividad();
        }
    }
    /////////////////////////Actividades  Interaccion/////////////////
    public void cambiarEstadoToGuardia(Guardia guardia){
        if( (guardia.isDisponible() )){
            guardia.setDisponible(false);
        }
        else{
            System.out.println("Guardia no disponible");
        }
    }
    Guardia buscarGuardia(){
        System.out.println("Ingrese codigo guardia");
        Scanner sc = new Scanner(System.in);
        String legajo = sc.nextLine();
        for(Personal personal : misPersonal){
            if(personal.getLegajo().equalsIgnoreCase(legajo)){
                return (Guardia) personal;
            }
        }
        System.out.println("Personal no encontrado");
        return null;
    }
    public void showGuardia(Guardia guardia){
        System.out.println("==================================");
        System.out.println("Nombre: "+guardia.getNombre());
        System.out.println("Apellido: "+guardia.getApellido());
        System.out.println("STATUS:"+ guardia.isDisponible());
    }
    public void actvivarTrea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tarea para hacer:");

        int opcion = sc.nextInt();

        for(Actividades a: misActividades){

            if (opcion==a.getId() && a.isSupervisada()){

                System.out.println("\tACTIVACION DE TAREA");
                Guardia personal = buscarGuardia();
                if(personal!=null) {
                    cambiarEstadoToGuardia(personal);
                    System.out.println("Puede realizar la actividad se ha asignado al Guardia:");
                    showGuardia(personal);
                }
                else{
                    System.out.println("Parece que hay un error");
                }
            }

        }
    }

    Reclusos encontrarRecluso(){
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ID:");
        id = sc.nextInt();
        for(Reclusos recluso : misReclusos){
            if(id==recluso.getId()){
                return recluso;
            }
        }
        System.out.println("Recluso no encontrado");
        return null;
    }
    public void permitirReclusos(){
        Reclusos recluso = encontrarRecluso();
        if(recluso!=null && recluso instanceof MinimaSeguridad){
            mostrarActividades();
        }
        if(recluso!=null && recluso instanceof MediaSeguridad){
            System.out.println("5-Participacion Programas de Rehabilitacion");
            System.out.println("6-Tareas Mantenimiento");
        }
        if(recluso!=null && recluso instanceof MaximaSeguridad){
            System.out.println("5-Participacion Programas de Rehabilitacion");
        }
        if(recluso==null){
            System.out.println("Ha ocurrido un error");
        }
        actvivarTrea();

    }






}

