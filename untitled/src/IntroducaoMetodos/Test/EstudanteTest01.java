package IntroducaoMetodos.Test;

import IntroducaoMetodos.Dominio.Estudante;

public class EstudanteTest01 {
    static void main() { // 2 variveis de ref
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Guizu";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Le";
        estudante02.idade = 23;
        estudante02.sexo = 'F';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
        System.out.println("----------------");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);


    }
}
