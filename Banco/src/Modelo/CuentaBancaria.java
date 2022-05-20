package Modelo;

import java.util.Scanner;

public class CuentaBancaria {
    
    private int noCuenta;
    private String tipoCuenta;
    private Double saldoInicial;
    private Double saldo;
    private Usuario titular;
    
    public CuentaBancaria(){
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
    public void setTitular(Scanner sc){
        
        System.out.print("Digite la cédula del titular: ");titular.setCc(sc.nextLine());
        System.out.print("Digite el nombre del titular: ");titular.setNombre(sc.nextLine());
        System.out.print("Digite el apellido del titular: ");titular.setApellido(sc.nextLine());
        System.out.print("Digite el sexo: ");titular.setSexo(sc.nextLine().charAt(0));
    }
    public Usuario getTitular(){return this.titular;}
    
    
}
