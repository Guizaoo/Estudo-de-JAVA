package Associacao.Test;

import Associacao.Dominio.Jogador;
import Associacao.Dominio.Time;

public class JogadorTest03 {
    static void main(String[] args) {
        Jogador jogador = new Jogador("cafu");
        Time time = new Time("Brasil");

        jogador.setTime(time);

        jogador.imprime();
    }

}
