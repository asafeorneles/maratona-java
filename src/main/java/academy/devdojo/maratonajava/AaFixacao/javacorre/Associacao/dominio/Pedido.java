package academy.devdojo.maratonajava.AaFixacao.javacorre.Associacao.dominio;

public class Pedido {
    private int id;
    private Cliente cliente;
    private Produto [] produtos;

    public void imprime(){
        System.out.println("Id do pedido: " + id);
        if(cliente != null){
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Email do cliente: " + cliente.getEmail());
        }

        if(produtos == null) return;
        for(Produto produto : produtos){
            System.out.printf("%s - Preco: R$ %.2f\n", produto.getNome(), produto.getPreco());
        }
    }

    public Pedido(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }
}
