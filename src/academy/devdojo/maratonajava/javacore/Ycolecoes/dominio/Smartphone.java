package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // Reflexivo: x.equals(x) tem que ser true para tudo o que for diferente de null.
    // Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) == y e x.equals(z) == true logo, y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) tem que retornar false
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false; // Se o obj que está sendo comparado for null, retorna false
        if (this == obj) return true; // Se os objetos comparados forem os mesmos (mesmo endereço na memória), retorna true pois se trata do mesmo obj
        if (this.getClass() != obj.getClass()) return false; // Se a classe dos objetos comparados não for a mesma, ou seja se obj1 nao for um obj2, retorna false.
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    } // agora, o .equals compara o serialNumber dos objetos. (Antes comparava se era o mesmo objeto)

    // se x.equals(y) == true, y.hashCode() == x.hashCode();
    // se y.hashCode() == x.hashCode(), não necessariamente y.equals(x) tem que ser true
    // se y.hashCode() != x.hashCode(), x.equals(y) == false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : serialNumber.hashCode(); // Se serialNumber for nulo, retorna 0. Se não, retorna o hashCode definido pelo próprio java/
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
