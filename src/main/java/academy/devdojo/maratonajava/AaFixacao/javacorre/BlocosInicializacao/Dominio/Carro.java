package academy.devdojo.maratonajava.AaFixacao.javacorre.BlocosInicializacao.Dominio;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    private static int totalCarros = 0;

    static {
        System.out.println("Classe carro carregada!\n");
    }

    {
        if (this.marca == null){
            this.marca = "Marca desconhecida";
        }
    }

    public Carro() {
        totalCarros++;
    }

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        totalCarros++;
    }

    public void exibirDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        if (this.ano < 1886) {
            System.out.println("Nao existe carro fabricado antes de 1886");
        }
        else{
            System.out.println("Ano: " + ano);
        }
        System.out.println();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1886) {
            System.out.println("Nao existe carro fabricado antes de 1886");
            return;
        }
        this.ano = ano;
    }

    public static int getTotalCarros() {
        return totalCarros;
    }
}
