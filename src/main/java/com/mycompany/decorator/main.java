
package com.mycompany.decorator;

/**
 *
 * @author Usuario
 */
public class main {

    public static void main(String[] args) {
        Automovil carro = new AutoEstandar("Mitsubisi");
        carro = new AutomovilElectricoFeature(carro);
        carro.encender();
        carro.accelerar();
        carro.detener();
    }
}
