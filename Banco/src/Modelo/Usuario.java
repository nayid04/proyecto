package Modelo;


public class Usuario {
    private String cc;
    private String nombre;
    private String apellido;
    private char sexo;
    
    public Usuario(){
        this.cc="";
        this.nombre="";
        this.apellido="";
    }

    public Usuario(String cc, String nombre, String apellido, char sexo) {
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    
    
}
