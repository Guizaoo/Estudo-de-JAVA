public class Operadorternario {
    static void main(String[] args) {

        //salario tem q ser > 2000
        double salario = 500;

        String DoarCaridade = "tenho como doar essse mes";
        String NaoDoarCaridade = "Não tenho como doar esse mes";

        // condicao ? verdadeiro : flaso

        String resultado = salario > 2000 ? DoarCaridade : NaoDoarCaridade;

        System.out.println(resultado);
    }
}
