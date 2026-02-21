package IntroducaoMetodos.Test;

import IntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest01 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.SomarDois();


        System.out.println("------------");

        calculadora.subtraiDoisNumeros();

        System.out.println("--------------");

        calculadora.multiplicandonumeros(10, 5);
    }
}
