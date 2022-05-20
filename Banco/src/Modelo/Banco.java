package Modelo;

import java.util.Scanner;

public class Banco {
    private String nombres;
    private int no_max_sedes;
    private Sede sedes[] = new Sede[30];
    private int numSedes;
    
    public Banco(){
        this.nombres = "";
        this.no_max_sedes = 0;
        this.numSedes=0;
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
    public void crearSedes(int num1, Scanner sc){
        sedes[num1] = new Sede();
        System.out.print("Digite el nombre de la sede: ");sedes[num1].setNombre(sc.nextLine());
        System.out.print("Digite la ciudad de la sede: ");sedes[num1].setCiudad(sc.nextLine());
        System.out.print("Digite la direccion de la sede: ");sedes[num1].setDireccion(sc.nextLine());
        this.numSedes++;
    }
    
    public Sede consultarSedes(int num){
        return sedes[num];
    }
    
}
