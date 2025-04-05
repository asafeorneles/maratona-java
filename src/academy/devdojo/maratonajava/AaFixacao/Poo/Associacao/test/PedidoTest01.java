package academy.devdojo.maratonajava.AaFixacao.Poo.Associacao.test;

import academy.devdojo.maratonajava.AaFixacao.Poo.Associacao.dominio.Cliente;
import academy.devdojo.maratonajava.AaFixacao.Poo.Associacao.dominio.Pedido;

public class PedidoTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Asafe", "asafeorneles@gmail.com");
        Pedido pedido1 = new Pedido(15);
        Pedido pedido2 = new Pedido(22);
        Pedido pedido3 = new Pedido(5);
        Pedido [] pedidos = {pedido1, pedido2, pedido3};

        cliente.setPedidos(pedidos);

        pedido1.setCliente(cliente);

        pedido1.imprime();
        cliente.imprime();

    }
}
