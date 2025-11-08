package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Gabi-gol");
        Jogador jogador2 = new Jogador("Mateus Pereira");
        Jogador jogador3 = new Jogador("Dudu");
        Jogador [] jogadores = { jogador1, jogador2, jogador3 };

        Time time = new Time("Cruzeiro", jogadores);

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);

        System.out.println("--- Jogadores ---");
        for (Jogador jogador: jogadores){
            System.out.println(jogador.getNome());
            System.out.println(jogador.getTime());
        }

        System.out.println("\n--- Time ---");
        time.imprime();
    }

}
