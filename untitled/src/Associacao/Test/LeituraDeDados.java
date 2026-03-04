package Associacao.Test;

import java.util.Scanner;

public class LeituraDeDados {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loginCorreto = "Guizu";
        String senhaCorreta = "12345";

        System.out.println("Digite o login: ");
        String loginDigitado = sc.nextLine();

        System.out.println("Digite o login: ");
        String senhaDigitada = sc.nextLine();

        if (loginDigitado.equals(loginCorreto) && senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login ou senha incorretos.");
        }

        sc.close();
    }
}
