package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Asafe Orneles";
        nome.concat(" - Dev");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Asafe Orneles");
        sb.append(" - Sb").append(" - Dev");
        sb.reverse(); // Inverte a String
        sb.reverse(); // Inverti novamente
        sb.delete(0, 1);
        System.out.println(sb);
    }

    /* Um dos motivos da StringBuilder ser superior na performance, é por ela nao alocar
     toda hora uma nova String no pool de String */
}
