import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double NUMBER = sc.nextFloat();
        float SALARY = sc.nextFloat();
        double HORAS = sc.nextDouble();


        double Salario = (HORAS * SALARY);

        System.out.printf("NUMBER = %.0f%n", NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", Salario);

    }

}