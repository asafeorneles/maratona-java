package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04Exercicio {

    // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condiçao valorParcela >= 1000

    public static void main(String[] args) {
        double valorCarro = 30000;

        // Nessa forma, o laço continua sendo executado, mas pedimos pra mostrar no console somente quando a parcela é => 1000.
        /*
        for (int parcela = 1; parcela < valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000){
                System.out.println(parcela + " parcelas de R$ " + valorParcela);
            }
        }
        */

        for (int parcela = 1; parcela < valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println(parcela + " parcelas de R$ " + valorParcela);
        }
    }
}
