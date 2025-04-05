package academy.devdojo.maratonajava.AaFixacao.Poo.Associacao.test;

import academy.devdojo.maratonajava.AaFixacao.Poo.Associacao.dominio.Pedido;
import academy.devdojo.maratonajava.AaFixacao.Poo.Associacao.dominio.Produto;

public class PedidoTest02 {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1);
        Pedido pedido2 = new Pedido(2);
        Pedido pedido3 = new Pedido(3);

        Produto produto1 = new Produto("Produto 1", 120);
        Produto produto2 = new Produto("Produto 2", 50.90);
        Produto produto3 = new Produto("Produto 3", 75);

        Produto [] produtos1 = {produto1, produto2};
        Produto [] produtos2 = {produto1, produto2, produto3};

        Pedido [] pedidos1 = {pedido1, pedido2};
        Pedido [] pedidos2 = {pedido2};

        produto1.setPedidos(pedidos1);
        produto2.setPedidos(pedidos1);
        produto3.setPedidos(pedidos2);

        pedido1.setProdutos(produtos1);
        pedido2.setProdutos(produtos2);

        pedido1.imprime();
        System.out.println("-----------");
        pedido2.imprime();
        System.out.println("-----------");
        produto1.imprime();
    }
}
