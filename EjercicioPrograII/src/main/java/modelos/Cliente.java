/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Daiki
 */
public class Cliente extends Persona {
    private String nit;
    
    public Cliente(){}

    public Cliente(String nit) {
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public void agregar(){
    System.out.println("NIT: " + nit);
    System.out.println("Nombres: " + getNombres());
    System.out.println("Apellidos: " + getApellidos());
    System.out.println("Direccion: " + getDireccion());
    System.out.println("Telefono: " + getTelefono());
    System.out.println("Fecha Nacimiento: " + getFecha_nacimiento());
    }
    public void modificar(){
    System.out.println("NIT: " + nit);
    System.out.println("Nombres: " + getNombres());
    System.out.println("Apellidos: " + getApellidos());
    System.out.println("Direccion: " + getDireccion());
    System.out.println("Telefono: " + getTelefono());
    System.out.println("Fecha Nacimiento: " + getFecha_nacimiento());
    }
        public void eliminar(){
    System.out.println("NIT: " + nit);
    System.out.println("Nombres: " + getNombres());
    System.out.println("Apellidos: " + getApellidos());
    System.out.println("Direccion: " + getDireccion());
    System.out.println("Telefono: " + getTelefono());
    System.out.println("Fecha Nacimiento: " + getFecha_nacimiento());
    }
    public Cliente(String string, String string1, String string2, String string3, String string4, String string5) {
        super(string, string1, string2, string3, string4);
        this.nit= string5;
    }
    
            
     
}
