package Desafios;

import java.util.Scanner;

public class Desafio03
//Desafio 3 — Média do aluno
//
//Leia 3 notas double, calcule a média e mostre:
//
//APROVADO se média >= 7
//
//RECUPERACAO se média >= 5 e < 7
//
//REPROVADO se média < 5



{
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int media = 7;

        double nota = sc.nextDouble();


        if (nota >= media) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperacao");
        }else{
            System.out.println("Reprovado");
        }

    }
}
