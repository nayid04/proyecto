package Modelo;

import java.util.Scanner;

public class Sede {
    private String nombre;
    private String ciudad;
    private String direccion;
    private int no_max_cuentas;
    private int codigo;
    private final CuentaBancaria cuenta[] = new CuentaBancaria[10];
    private int numCuentas;
    
    public Sede(){
        
    }

    public Sede(String nombre, String ciudad, String direccion, int no_max_cuentas, int codigo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.no_max_cuentas = no_max_cuentas;
        this.codigo = codigo;
    }

    //--------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //------------------------------------
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    //-----------------------------------
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //---------------------------------------
    public int getNo_max_cuentas() {
        return no_max_cuentas;
    }

    public void setNo_max_cuentas(int no_max_cuentas) {
        this.no_max_cuentas = no_max_cuentas;
    }

    //------------------------------------------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //-----------------------------------------
    public void abrirCuenta(int numero, Scanner sc){
        
        cuenta[numero] = new CuentaBancaria();
        
        System.out.print("Digite el número de cuenta: ");cuenta[numero].setNoCuenta(sc.nextInt());
     
        System.out.print("Digite el tipo de cuenta: ");cuenta[numero].setTipoCuenta(sc.nextLine());
        System.out.print("Con que saldo inicia la cuenta: ");cuenta[numero].setSaldoInicial(sc.nextDouble());
        System.out.println("\nInformación del usuario\n");
        sc.nextLine();
        cuenta[numero].setTitular(sc);
        
        this.numCuentas++;
    }
    
}
