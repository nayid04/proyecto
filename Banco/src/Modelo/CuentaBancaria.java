package Modelo;

import java.util.Scanner;

public class CuentaBancaria {
    
    private int noCuenta;
    private String tipoCuenta;
    private Double saldoInicial;
    private Double saldo;
    private Usuario titular;
    
    public CuentaBancaria(){
        this.noCuenta=0;
        this.tipoCuenta="";
        this.saldoInicial=0.0;
        this.saldo=0.0;
        this.titular = new Usuario();
    }

    public CuentaBancaria(int noCuenta, String tipoCuenta, Double saldoInicial, Double saldo) {
        this.noCuenta = noCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoInicial = saldoInicial;
        this.saldo = saldo;
    }

    //--------------------------------
    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    //-----------------------------------
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    //-----------------------------------
    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    //------------------------------------
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    //--------------------------------------
    public void setTitular(){
        Scanner salida = new Scanner(System.in);
        System.out.print("Digite la cédula del titular: ");
        titular.setCc(salida.nextLine());
        System.out.print("Digite el nombre del titular: ");
        titular.setNombre(salida.next());
        System.out.print("Digite el apellido del titular: ");
        titular.setApellido(salida.next());
        System.out.print("Digite el sexo: ");
        titular.setSexo(salida.next().charAt(0));
    }
    public void getTitular(){
        System.out.println("Cédula del titular: "+titular.getCc());
        System.out.println("Nombre del titular: "+titular.getNombre());
        System.out.println("Apellido del titular: "+titular.getApellido());
        System.out.println("Sexo: "+titular.getSexo());
    }
    
}
