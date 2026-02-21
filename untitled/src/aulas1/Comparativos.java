package aulas1;

public class Comparativos {
    static void main(String[] args) {

        //  && ele precisa q os 2 sejam verdadeiros para que me retorne True

        // || OR ele precisa que apenas 1 seja vadadeiro para retornar true caso so dois sejam false ele retorna false
        int idade = 23;
        float salrio = 4500F;

        boolean isMaiorQue20 = idade >= 23 && salrio >= 4000;
        boolean isSalarioMaior = idade >= 23 && salrio >= 5000;

        System.out.println(isMaiorQue20);
        System.out.println(isSalarioMaior);
    }
}