package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class OuterClassesTest02 {
    private String name = "Zoro";

    void print(String param) {
        String firstName = "Roronoa"; // Os atributos criados dentro do metodo por padrão é final. Eles não podem ser modificados.

        class LocalClass{
            public void printLocal(){
                System.out.println(param);
                System.out.println(firstName + " " +name);
            }
        }

        // Em classes internas dentro de métodos, elas devem ser chamadas dentro do propio metodo.
        LocalClass localClass = new LocalClass();
        localClass.printLocal(); // Ou: new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClasses = new OuterClassesTest02();
        outerClasses.print("Este parametro por padrao é final.");
    }
}
