package IntroducaoMetodos.Test;

import IntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest02 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
double result =calculadora.divideDoisNumeros(20 ,2);
        System.out.println(result);
    }
}