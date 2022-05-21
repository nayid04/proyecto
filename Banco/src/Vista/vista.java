package Vista;

import Modelo.*;
import java.util.Scanner;

public class vista {

    public static void main(String[] args) {
        Scanner salida = new Scanner(System.in);
        Banco banco = new Banco();
        Sede sede = new Sede();
        CuentaBancaria cuenta = new CuentaBancaria();
        Usuario usuario = new Usuario();

        int opcion = 0, i = 0, codigo = 0, num_sedes = 0;
        boolean condicion = true;
        String continuar = "";

        do {
            System.out.println("----------Menu-----------"
                    + "\n 1.Crear banco."
                    + "\n 2.Crear sede."
                    + "\n 3.Crear cuenta bancaria."
                    + "\n 4.Consultar sede."
                    + "\n 5.Lista de sedes."
                    + "\n 6.Consultar cuenta."
                    + "\n 7.Salir.");

            System.out.print("¿Que desea hacer?: ");
            opcion = salida.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el nombre del banco: ");
                banco.setNombres(salida.next());
                System.out.print("Ingrese el numero maximo de sedes: ");
                banco.setNo_max_sedes(salida.nextInt());

            }
            if (opcion == 2) {
                if (banco.getNombres().equals("")) {
                    System.out.println("primero cree un banco.");
                } else {
                    banco.crearSedes();
                    System.out.println("sede creada con exito.");
                }
            }
            if (opcion == 3) {

                if (banco.getNombres().equals("")) {
                    System.out.println("primero cree un banco.");
                } else {

                    sede.abrirCuenta(); 

                }
            }
            if (opcion == 4) {
                if (banco.getNombres().equals("")) {
                    System.out.println("primero cree un banco.");
                } else {

                    System.out.print("Ingrese el numero de la sede: ");
                    banco.consultarSedes(salida.nextInt());
                }

            }
            if (opcion == 5) {
                if (banco.getNombres().equals("")) {
                    System.out.println("primero cree un banco.");
                } else {
                    banco.listaSedes();
                }

            }
            if (opcion == 6) {
                if (banco.getNombres().equals("")) {
                    System.out.println("primero cree un banco.");
                } else {
                    System.out.print("Ingrese el codigo de la cuenta: ");
                    sede.consultarCuenta(salida.nextInt());
                }

            }
            if (opcion == 7) {
                System.out.println("Programa terminado.");
                condicion = false;
            }

            System.out.println("¿Desea continuar?(si/no): ");
            continuar = salida.next();

            if (continuar.equals("no")) {
                condicion = false;
            }

        } while (condicion == true);

    }
}
