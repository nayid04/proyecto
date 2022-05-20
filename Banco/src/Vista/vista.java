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
        
        int opcion=0;
        boolean condicion=true;
        String continuar="";
        
        do{
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
            
            if(opcion==1){
                System.out.print("Ingrese el nombre del banco: ");
                banco.setNombres(salida.next());
            }
            if(opcion==2){
                System.out.print("¿Cuantas sedes desea crear?: ");
                banco.crearSedes(salida.nextInt(),salida);
            }
            if(opcion==3){
                System.out.print("Ingrese le numero de la cuenta: ");
                cuenta.setNoCuenta(salida.nextInt());
                
                System.out.print("Ingrese el tipo de cuenta: ");
                cuenta.setTipoCuenta(salida.next());
                
                System.out.print("Saldo inicial: ");
                cuenta.setSaldoInicial(salida.nextDouble());
                
                System.out.print("Ingrese su saldo actual: ");
                cuenta.setSaldo(salida.nextDouble());
            }
            if(opcion==4){
                System.out.print("Ingrese el numero de la sede: ");
                banco.consultarSedes(salida.nextInt());
            }
            if(opcion==5){
                
            }
            if(opcion==6){
                
            }
            if(opcion==7){
                System.out.println("Programa terminado.");
                condicion=false;
            }
            
            System.out.println("¿Desea continuar?(si/no): ");
            continuar = salida.next();
            
            if(continuar.equals("no")){
                condicion =false;
            }
            
        }while(condicion==true);
        
        
        
    }
}
