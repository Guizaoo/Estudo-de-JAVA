package Classes.a.test;

import Classes.a.Dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "C4";
        carro.marca = "Citroën";
        carro.ano = 2023;

        System.out.println(carro.nome + " " + carro.ano+ " " + carro.marca);
    }

}
