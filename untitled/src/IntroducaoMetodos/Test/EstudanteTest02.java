package IntroducaoMetodos.Test;

import IntroducaoMetodos.Dominio.Estudante;
import IntroducaoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Guizu";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Le";
        estudante02.idade = 23;
        estudante02.sexo = 'F';

        estudante01.imprime();
        System.out.println("-");
        estudante02.imprime();
    }
}
