package academy.devdojo.maratonajava.AaFixacao.javacorre.Associacao.dominio;

public class Produto {
    private String nome;
    private double preco;
    private Pedido [] pedidos;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void imprime(){
        System.out.printf("%s Preco: R$ %.2f\n" , this.nome, this.preco);
        if(pedidos != null){
            for(Pedido pedido : pedidos){
                System.out.println("Pedido id: " + pedido.getId());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }
}
