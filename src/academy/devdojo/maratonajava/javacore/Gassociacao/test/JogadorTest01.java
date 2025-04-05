package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pele");
        Jogador jogador02 = new Jogador("Ronaldinho");
        Jogador jogador03 = new Jogador("Neymar");

        Jogador[] jogadores = new Jogador[]{jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }
}
