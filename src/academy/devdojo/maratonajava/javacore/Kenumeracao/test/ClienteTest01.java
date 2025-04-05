package academy.devdojo.maratonajava.javacore.Kenumeracao.test;

import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Sanji", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Chopper", TipoCliente.PESSOA_JURIDICA,TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Nami", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(cliente3.toString());

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(120));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(120));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_JURIDICA");
        System.out.println(tipoCliente.RELATORIO_PESSOA);

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);

        /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        FAZER ESSA ATIVIDADE DE FIXAÇAO
        CONVERSA NO CHAT: https://chatgpt.com/c/67eb6106-aacc-8004-a694-e846a4f552f9

        🎯 Desafio: Sistema de Chamados de Suporte
        Você vai criar um sistema de chamados de suporte para uma empresa de TI. Cada chamado tem um tipo de problema e um nível de prioridade.

        Criar um enum chamado TipoProblema com os seguintes tipos e códigos:
        HARDWARE (1)
        SOFTWARE (2)
        REDE (3)
        OUTRO (4)

        Criar um enum chamado Prioridade com os seguintes níveis e tempos máximos de resposta (em horas):
        ALTA (4h)
        MEDIA (12h)
        BAIXA (24h)

        Criar uma classe Chamado que tenha:
        Um TipoProblema
        Uma Prioridade
        Um método exibirDetalhes() que mostre todas as informações do chamado

        Criar métodos dentro dos enum para buscar pelo código (para TipoProblema) e buscar pelo tempo máximo de resposta (para Prioridade).

        🏆 Exemplo de Entrada e Saída Esperada
        Código de teste:

        java
        Copiar
        Editar
        public class Main {
            public static void main(String[] args) {
                Chamado chamado1 = new Chamado(TipoProblema.porCodigo(2), Prioridade.ALTA);
                chamado1.exibirDetalhes();

                Chamado chamado2 = new Chamado(TipoProblema.porCodigo(3), Prioridade.MEDIA);
                chamado2.exibirDetalhes();
            }
        }
        Saída esperada:

        yaml
        Copiar
        Editar
        Chamado criado!
        Tipo: SOFTWARE
        Prioridade: ALTA (Tempo máximo de resposta: 4h)

        Chamado criado!
        Tipo: REDE
        Prioridade: MEDIA (Tempo máximo de resposta: 12h)
        🔥 Regras
        ✔ Criar os enum com métodos para busca
        ✔ Criar a classe Chamado corretamente
        ✔ Implementar o método exibirDetalhes()
        ✔ Testar com diferentes chamados

        Tenta fazer aí e me manda o código! Se precisar de uma dica, só chamar. 🚀
        */
        
    }
}
