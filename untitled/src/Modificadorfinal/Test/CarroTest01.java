package Modificadorfinal.Test;

import Modificadorfinal.Dominio.Carro;
import Modificadorfinal.Dominio.Comprador;
import Modificadorfinal.Dominio.Ferrari;

public class CarroTest01 {
    static void main(String[] args) {

       Carro carro = new Carro();

        System.out.println(Carro.VELOCIADE_LIMITE);

        carro.COMPRADOR.setNome("lucas");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Bubu");

        ferrari.imprime();


    }
}
