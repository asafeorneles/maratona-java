package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return valor * Computador.IMPOSTO_POR_CENTO;
    }
}
