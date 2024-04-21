package org.example;
import org.example.Personal.Personal;
import org.example.Reclusos.Reclusos;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    SistemaCarcelario sistema = new SistemaCarcelario();
    sistema.agregarActividades();
    sistema.agregarPersonal();
    sistema.agregarReclusos();

        int opcion;
        Scanner sc = new Scanner(System.in);

    do {
        System.out.println("==============================");
        System.out.println("SISTEMA CARCELARIO LA MATANZA:");
        System.out.println("==============================");
        System.out.println("1-Mostrar Actividades:");
        System.out.println("2-Mostrar Personal:");
        System.out.println("3-Mostrar Reclusos:");
        System.out.println("4-Solicitud de Actividades:");
        System.out.println("5-Status de Guardia:");
        System.out.println("999-EXIT");

        opcion = sc.nextInt();

        switch (opcion) {
            case 1:

                sistema.mostrarActividades();
                break;
            case 2:

                sistema.mostrarPersonal();
                break;
            case 3:

                sistema.mostrarReclusos();
                break;
            case 4:

                sistema.permitirReclusos();
                break;
            case 5:

                sistema.mostrarStatus();
                break;
        }
    }while (opcion != 999);

    }
}