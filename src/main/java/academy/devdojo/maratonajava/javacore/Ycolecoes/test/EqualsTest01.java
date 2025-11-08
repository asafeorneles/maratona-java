package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC2", "Iphone");
        Smartphone s2 = new Smartphone("1ABC2", "Iphone");

        System.out.println(s1.equals(s2));
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
    }
}
