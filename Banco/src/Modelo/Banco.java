package Modelo;

import java.util.Scanner;

public class Banco {

    private String nombres;
    private int no_max_sedes;
    Sede sedes[] = new Sede[30];
    private int numSedes;

    public Banco() {
        this.nombres = "";
        this.no_max_sedes = 0;
        this.numSedes = 0;
    }

    public Banco(String nombres, int no_max_sedes) {
        this.nombres = nombres;
        this.no_max_sedes = no_max_sedes;
    }

    //----------------------------
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    //----------------------------
    public int getNo_max_sedes() {
        return no_max_sedes;
    }

    public void setNo_max_sedes(int no_max_sedes) {
        this.no_max_sedes = no_max_sedes;
    }

    //------------------------------
    public void crearSedes() {
        Scanner salida = new Scanner(System.in);

        sedes[this.numSedes] = new Sede();
        System.out.print("-----------Sede " + (this.numSedes + 1) + "------------\n");
        System.out.print("Digite el nombre de la sede: ");
        sedes[this.numSedes].setNombre(salida.nextLine());
        System.out.print("Digite la ciudad de la sede: ");
        sedes[this.numSedes].setCiudad(salida.nextLine());
        System.out.print("Digite la direccion de la sede: ");
        sedes[this.numSedes].setDireccion(salida.nextLine());
        System.out.print("Digite la codigo de la sede: ");
        sedes[this.numSedes].setCodigo(salida.nextInt());

        this.numSedes++;
    }

    public void listaSedes() {
        for (int i = 0; i != this.numSedes; i++) {
            System.out.println("-------- Datos sede "+(i+1)+" ---------");
            System.out.println("Nombre: " + sedes[i].getNombre());
            System.out.println("Ciudad: " + sedes[i].getCiudad());
            System.out.println("Direccion: " + sedes[i].getDireccion());
            System.out.println("Codigo: " + sedes[i].getCodigo());

        }
    }

    public void consultarSedes(int codigo) {
        int veri = 0;
        for (int i = 0; i != this.numSedes; i++) {
            if (codigo == sedes[i].getCodigo()) {
                System.out.println("-------- Datos sede ---------");
                System.out.println("Nombre: " + sedes[i].getNombre());
                System.out.println("Ciudad: " + sedes[i].getCiudad());
                System.out.println("Direccion: " + sedes[i].getDireccion());
                System.out.println("Codigo: " + sedes[i].getCodigo());
                veri = 1;
                break;
            }
        }

        if (veri == 0) {
            System.out.println("Esta sede no esta registrada.");
        }

    }

}
