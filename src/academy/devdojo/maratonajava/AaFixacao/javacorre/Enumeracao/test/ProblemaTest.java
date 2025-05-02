package academy.devdojo.maratonajava.AaFixacao.javacorre.Enumeracao.test;

import academy.devdojo.maratonajava.AaFixacao.javacorre.Enumeracao.dominio.Chamado;
import academy.devdojo.maratonajava.AaFixacao.javacorre.Enumeracao.dominio.Prioridade;
import academy.devdojo.maratonajava.AaFixacao.javacorre.Enumeracao.dominio.TipoProblema;

public class ProblemaTest {
    public static void main(String[] args) {
        Chamado chamado = new Chamado("Problema com login", TipoProblema.SOFTWARE, Prioridade.MEDIA);
        chamado.imprime();
        System.out.println(TipoProblema.obterTipoPeloCodigo(2));
        System.out.println(Prioridade.obterPrioridadePelasHoras("12h"));
    }

}
