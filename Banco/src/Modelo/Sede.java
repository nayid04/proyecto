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
        this.nombre="";
        this.ciudad="";
        this.direccion="";
        this.codigo=0;
        this.numCuentas=0;
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
    public void abrirCuenta(){
        Scanner salida = new Scanner(System.in);
        cuenta[this.numCuentas] = new CuentaBancaria();
        
        System.out.println("-------- Cuenta "+(this.numCuentas+1)+" ---------");
        System.out.print("Digite el número de cuenta: ");
        cuenta[this.numCuentas].setNoCuenta(salida.nextInt());
        System.out.print("Digite el tipo de cuenta: ");
        cuenta[this.numCuentas].setTipoCuenta(salida.next());
        System.out.print("¿Cuanto dinero va a depositar?: ");
        cuenta[this.numCuentas].setSaldo(salida.nextDouble());
        if(cuenta[this.numCuentas].getSaldoInicial()==0){
            cuenta[this.numCuentas].setSaldoInicial(cuenta[this.numCuentas].getSaldo());
        }
        
        cuenta[this.numCuentas].setTitular();
        
        this.numCuentas++;
    }
    
    public void consultarCuenta(int num){
        int veri = 0;
        for(int i=0;i!=this.numCuentas;i++){
            if(num==cuenta[i].getNoCuenta()){
                System.out.println("-------- Datos Cuenta --------");
                System.out.println("Numero de cuenta: "+cuenta[i].getNoCuenta());
                System.out.println("Tipo de cuenta: "+cuenta[i].getTipoCuenta());
                System.out.println("Saldo inicial: "+cuenta[i].getSaldoInicial());
                System.out.println("Saldo actual: "+cuenta[i].getSaldo());
                System.out.println("-------- Datos Usuario ---------");
                cuenta[i].getTitular();
                veri=1;
                
            } 
        }
        if (veri == 0) {
            System.out.println("Esta Cuenta no esta registrada.");
        }
    }
    
}
