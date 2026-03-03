package Associacao.Test;

import Associacao.Dominio.Jogador;
import Associacao.Dominio.Time;

public class JogadorTest02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("Santos Futibol Club");

        jogador1.setTime(time);
        jogador1.imprime();

    }
}
