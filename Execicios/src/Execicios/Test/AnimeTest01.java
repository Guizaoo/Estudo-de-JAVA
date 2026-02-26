package Execicios.Test;

import Execicios.Dominio.Anime;

public class AnimeTest01 {

    static void main(String[] args) {
        //por ser metodo construtor, ele ja tem que ser inicializado passando os valores como nome e eps no caso do ex.

//        Anime.setEpisodio(40);

        Anime anime1 = new Anime("One pice", 25);
        Anime anime2 = new Anime("Jujutsu", 50);
        Anime anime3 = new Anime("taxi driving", 60);




        anime1.imprime();
        anime2.imprime();
        anime3.imprime();
    }



}
