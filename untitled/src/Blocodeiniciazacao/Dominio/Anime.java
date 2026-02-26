package Blocodeiniciazacao.Dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    //  1 - alocaddo espcao em memoria pro objeto
    //  2 - Cada atributo de classe e acriado e inicializado com valor defaulto ou o que for passado
    //  3 - bloco de inicializacao e executado
    //  4 - contrutor e executado
    {
        System.out.println("Bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }


    public Anime() {

        for (int episodio : this.episodios) {
            System.out.printf(episodio + " ");
        }
        System.out.println("");
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
