package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

public enum TipoPagamento{
        DEBITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
    // Metodos abstratos precisam ser sobrescritos como foi feito no DEBITO e CREDITO, pois por ser abstract, é como se ele não existisse

}