package Modificadorestatico.Test;

import Modificadorestatico.Dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        //metodo statico
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Jaguar", 290);



        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
