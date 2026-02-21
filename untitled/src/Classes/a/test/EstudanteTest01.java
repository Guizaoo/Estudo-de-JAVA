package Classes.a.test;

import Classes.a.Dominio.Estudante;

public class EstudanteTest01 {
    static void main() {
        Estudante estudante = new Estudante();

        estudante.nome = "Guilherme Dias";
        estudante.idade = 22;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
