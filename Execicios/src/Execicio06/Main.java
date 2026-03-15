package Execicio06;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();



        double somaSalario = (salario + (vendas * 0.15));


        System.out.printf("TOTAL = U$ %.2f%n", somaSalario);

    }

}

