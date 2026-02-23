package IntroducaoMetodos.Test;

import IntroducaoMetodos.Dominio.Funcionario;
import IntroducaoMetodos.Dominio.ImpressoraEstudante;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();


        funcionario.nome = "gui";
        funcionario.idade = 22;
        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
