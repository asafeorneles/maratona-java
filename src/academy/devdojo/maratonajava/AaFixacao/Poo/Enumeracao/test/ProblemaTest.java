package academy.devdojo.maratonajava.AaFixacao.Poo.Enumeracao.test;

import academy.devdojo.maratonajava.AaFixacao.Poo.Enumeracao.dominio.Chamado;
import academy.devdojo.maratonajava.AaFixacao.Poo.Enumeracao.dominio.Prioridade;
import academy.devdojo.maratonajava.AaFixacao.Poo.Enumeracao.dominio.TipoProblema;
import org.w3c.dom.ls.LSOutput;

public class ProblemaTest {
    public static void main(String[] args) {
        Chamado chamado = new Chamado("Problema com login", TipoProblema.SOFTWARE, Prioridade.MEDIA);
        chamado.imprime();
        System.out.println(TipoProblema.obterTipoPeloCodigo(2));
        System.out.println(Prioridade.obterPrioridadePelasHoras("12h"));
    }

}
