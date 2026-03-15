package Heranca.Test;

import Heranca.Dominio.Endereco;
import Heranca.Dominio.Pessoa;

public class HerancaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco ();

        endereco.setCep("65065470");
        endereco.setRua("rua 2");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Guilherme");
        pessoa.setCpf("04151174370");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
    }
}
