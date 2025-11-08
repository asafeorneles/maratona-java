package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

public enum TipoCliente {
    PESSOA_JURIDICA(1, "Pessoa Juridica"),
    PESSOA_FISICA(2, "Pessoa Fisica");

    public final int VALOR;
    public final String RELATORIO_PESSOA;

    public static TipoCliente tipoClientePorRelatorio(String relatorioPessoa){
        for (TipoCliente tipoCliente : values()){
            if (tipoCliente.RELATORIO_PESSOA.equals(relatorioPessoa)){
                return tipoCliente;
            }
        }
        return null;
    }

    TipoCliente(int valor, String relatorioPessoa) {
        this.VALOR = valor;
        this.RELATORIO_PESSOA = relatorioPessoa;
    }

    public void insento(){
        System.out.println();
    }
}
