package academy.devdojo.maratonajava.AaFixacao.Poo.Enumeracao.dominio;

public enum Prioridade {
    ALTA("4h"), MEDIA("12h"), BAIXA("24h");

    public final String HORAS;
    Prioridade(String horas){
        HORAS = horas;
    }

    public static Prioridade obterPrioridadePelasHoras(String horas){
        for (Prioridade prioridade : Prioridade.values()){
            if (prioridade.HORAS.equals(horas)){
                return prioridade;
            }
        }
        return null;
    }
}
