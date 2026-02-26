package Blocodeiniciazacao.Test;

import Blocodeiniciazacao.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio: anime.getEpisodios()) {
            System.out.printf(episodio + " ");
        }

    }
}
