package Desafios;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();


        if(entrada % 2 == 0){
            System.out.println("Numero Par");
        }else{
            System.out.println("Numero Impar");
        }

    }
}
