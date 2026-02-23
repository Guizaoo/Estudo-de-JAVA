package IntroducaoMetodos.Test;

import IntroducaoMetodos.Dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("guii");
        pessoa.setIdade(18);

//        pessoa.imprimir();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
