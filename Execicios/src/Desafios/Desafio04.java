package Desafios;

import java.util.Scanner;

public class Desafio04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.printf("Digite o nuemro para ele parar: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            System.out.println(i);

        }
        sc.close();
    }

}
