package Execicios.Dominio;

public class Anime {
    private String nome;
    private  static double episodio;


// metodo contrutor ele n passa retorno como o metod imprime.
    public Anime(String nome, double episodio){
    this.nome = nome;
//    this.episodio = episodio;
    }

    public void imprime(){
        System.out.println("------------------");
        System.out.println("Anime: " + nome );
        System.out.println("EP : " + Anime.episodio );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public static double getEpisodio() {
        return episodio;
    }

    public static void setEpisodio(double episodio) {
        Anime.episodio = episodio;
    }
}
