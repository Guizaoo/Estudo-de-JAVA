package Associacao.Test;

import Associacao.Dominio.Escola;
import Associacao.Dominio.Professor;

import javax.sound.sampled.Port;

public class EscolaTest01 {
    static void main(String[] args) {
        Professor professor1 = new Professor("Jorge");
        Professor professor2 = new Professor("gabriel");
        Professor professor3 = new Professor("guilherme");
        Professor professor4 = new Professor("pedro");
        Professor[] professores = {professor1,professor2,professor3,professor4};


        Escola escola = new Escola("literato", professores);

        escola.imprime();
    }
}
