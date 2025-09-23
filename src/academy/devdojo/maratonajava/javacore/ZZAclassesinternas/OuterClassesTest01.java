package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClasses = new OuterClassesTest01(); // Criando a variavel da classe externa normalmente normalmente
        Inner inner = outerClasses.new Inner(); // Agora criamos a variavel para a interna
        inner.printOuterClassAttribute(); // Agora podemos utilizar os atributos da classe interna.
        System.out.println("---------------");

        //OUTRA FORMA DE INICIALIZAR A CLASSE INTERNA
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner2.printOuterClassAttribute();
    }
}
