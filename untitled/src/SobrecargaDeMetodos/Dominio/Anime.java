package SobrecargaDeMetodos.Dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;


    public void inti(String tipo,int episodios, String nome){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;

    }

    public void inti(String tipo, int episodios, String nome,String genero){
        this.inti(nome, episodios, tipo);
        this.genero = genero;
    }

    public void imprime(){
            System.out.println(this.tipo);
            System.out.println(this.episodios);
            System.out.println(this.nome);
            System.out.println(this.genero);
        }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }


    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return  this.episodios;
    }
}
