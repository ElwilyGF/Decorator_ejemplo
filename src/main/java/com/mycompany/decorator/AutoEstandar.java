
package com.mycompany.decorator;

/**
 *
 * @author Usuario
 */
public class AutoEstandar implements Automovil
{
    private String nombre;
    public AutoEstandar(String n){
        nombre = n;
    }

    @Override
    public void accelerar() 
    {
        System.out.println("El automovil acelera");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void detener() 
    {
        System.out.println("El automovil Frena");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void encender() 
    {
        System.out.println("El automovil enciende");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
