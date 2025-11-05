package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio;

public interface Currency {
    String getSymbol();
}

class Real implements Currency{
    @Override
    public String getSymbol() {
        return "R$";
    }
}

class Dolar implements Currency{
    @Override
    public String getSymbol() {
        return "$";
    }
}
