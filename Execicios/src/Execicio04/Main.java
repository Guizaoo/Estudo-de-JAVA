package Execicio04;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Execicio04.Execicio05.Execicio06.Desafios.execicio07.Main" para que a sua solução execute
 *      Class name must be "Execicio04.Execicio05.Execicio06.Desafios.execicio07.Main" for your solution to execute
 *      El nombre de la clase debe ser "Execicio04.Execicio05.Execicio06.Desafios.execicio07.Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        double DIFERENCA = (A * B - C * D);

        System.out.printf("DIFERENCA = %.0f%n", DIFERENCA);
    }

}