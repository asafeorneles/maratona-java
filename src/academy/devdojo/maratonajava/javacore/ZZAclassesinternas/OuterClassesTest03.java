package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class OuterClassesTest03 {
    String name = "Asafe";

    static class Nested{
        String lastName = "Orneles";

        public void printName(){
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        new Nested().printName();
    }
}
