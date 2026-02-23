package IntroducaoMetodos.Dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    //Setter para Setar
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if (idade < 18){
            System.out.println("idade invalida");
        return;
        }
        this.idade = idade;
    }
    //Getter para Pegar

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
