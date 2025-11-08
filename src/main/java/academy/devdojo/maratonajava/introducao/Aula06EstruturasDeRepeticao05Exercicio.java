package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05Exercicio {
    public static void main(String[] args) {

        // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condiçao valorParcela >= 1000

        int valorCarro = 30000;

        for (int parcela = valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println(parcela + " parcelas de R$ " + valorParcela);
        }
    }
}
