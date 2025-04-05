package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 70000;
        double taxa;

        if (salario <= 34712) {
            taxa = salario * 0.097;
            System.out.println("Voce vai pagar: " + taxa + " de taxa.");

        } else if (salario > 34712 && salario <= 68507) {
            taxa = salario * 0.3735;
            System.out.println("Voce vai pagar: " + taxa + " de taxa.");

        } else {
            taxa = salario * 0.4950;
            System.out.println("Voce vai pagar: " + taxa + " de taxa.");
        }
    }
}
