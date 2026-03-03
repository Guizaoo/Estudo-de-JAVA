package Associacao.Test;

import Associacao.Dominio.Jogador;

public class JogadorTest01 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ney");
        Jogador jogador2 = new Jogador("Pele");
        Jogador jogador3 = new Jogador("Romario");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}
