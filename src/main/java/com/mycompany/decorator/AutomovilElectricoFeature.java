
package com.mycompany.decorator;

/**
 *
 * @author Usuario
 */
public class AutomovilElectricoFeature extends AutomovilDecorador
{

    public AutomovilElectricoFeature(Automovil auto) {
        super(auto);
    }

    @Override
    public void accelerar() {
        System.out.println("Inicio de potenciometro");
        getAuto().accelerar();
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void detener() {
        System.out.println("Activa frenos electronicos");
        getAuto().detener();
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void encender() {
        System.out.println("Iniciar sistema");
        getAuto().encender();
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
