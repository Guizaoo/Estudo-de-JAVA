import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double SALARY = sc.nextDouble();
        double HORAS = sc.nextDouble();
        Float NUMBER = sc.nextFloat();

        double Salario = (HORAS * SALARY);

        System.out.printf("SALARY = %.2f%n", Salario);

    }

}