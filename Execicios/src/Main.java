import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;


        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        //a)
        float TRIANGULO = (A * C) / 2;

        //b)
        double CIRCULO = (pi * C * C);
        //c)
        double TRAPEZIO = (A + B) * C / 2;
        //d)
        double QUADRADO = B * B;
        //e)
        double RETANGULO = A * B;

        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);

        sc.close();
    }

}