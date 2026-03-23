import java.util.Scanner;

public class Login {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Login: ");
        String login = sc.nextLine();

        System.out.print("senha: ");
        String senha= sc.nextLine();


        if ("guizu".equals(login) && "12345".equals(senha)) {
            System.out.println("Login realizado com sucesso");
        } else {
            System.out.println("Login ou senha incorretos");
        }


        sc.close();
    }
}
