package academy.devdojo.maratonajava.AaFixacao.Poo.Associacao.dominio;

public class Cliente {
    private String nome;
    private String email;
    private Pedido [] pedidos;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        if(pedidos == null) return;
        for(Pedido pedido : pedidos){
            System.out.println(pedido.getId());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Pedido[] getPedidos() {
        return pedidos;
    }
    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }
}
