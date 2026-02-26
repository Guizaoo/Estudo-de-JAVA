package Modificadorestatico.Dominio;

public class Carro {
    private String nome;
    private double velociadeMaxima;
    private static double velocidadeLimite = 250;

    //static faz com que o atributo pertença à classe, e não aos objetos criados a partir dela.

    public Carro(String nome, double velociadeMaxima) {
        this.nome = nome;
        this.velociadeMaxima = velociadeMaxima;
    }

    public void imprime(){
        System.out.println("------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velociade Maxima: " + this.velociadeMaxima);
        System.out.println("Velociadae Limite " + Carro.velocidadeLimite);
    }

    // SET static
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    //GET static
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }




    //Setter
    //pega o valor recebido
    //joga dentro do atributo do objeto

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelociadeMaxima() {
        return velociadeMaxima;
    }

    public void setVelociadeMaxima(double velociadeMaxima) {
       this.velociadeMaxima = velociadeMaxima;
    }

}

//Getter faz com que vc consigar ler tudo que ta atributo privado.
