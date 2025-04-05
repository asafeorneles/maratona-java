package academy.devdojo.maratonajava.AaFixacao.Poo.Enumeracao.dominio;

public enum TipoProblema {
    HARDWARE(1), SOFTWARE(2), REDE(3), OUTRO(4);

    public final int CODIGO;

    TipoProblema(int valor) {
        CODIGO = valor;
    }

    public static TipoProblema obterTipoPeloCodigo(int codigo) {
        for (TipoProblema tipoProblema : TipoProblema.values()) {
            if(tipoProblema.CODIGO == codigo){
                return tipoProblema;
            }
        }
        return null;
    }
}
