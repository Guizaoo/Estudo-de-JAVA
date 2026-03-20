package Enum.Test;

import Enum.Dominio.Cliente;
import Enum.Dominio.TipoCliente;

public class ClienteTest01 {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("ANA LETICIA", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("ERIKA", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);



    }
}
