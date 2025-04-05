package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Time timasso = new Time("Santos");
        Jogador jogador1 = new Jogador("Neymar");

        jogador1.setTime(timasso);

        jogador1.imprime();
    }
}
