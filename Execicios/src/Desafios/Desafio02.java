package Desafios;

import java.util.Scanner;

public class Desafio02 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("Segundo numero: ");
        int num2 = sc.nextInt();


        if (num1 > num2){
            System.out.println(num1 + " é maior que " + num2);
        }else {
            System.out.println(num2 + " Não é maior que " + num1);
        }

    }
}
