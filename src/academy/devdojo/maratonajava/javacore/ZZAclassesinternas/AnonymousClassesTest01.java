package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

    class Animal{
        public void walk(){
            System.out.println("walking");
        }
    }
    // Para evitar esta poluição de código, evitar criar mais classes, podemos usar classes anônimas
//    class Dog extends Animal{
//        @Override
//        public void walk() {
//            System.out.println("Dog walking");
//        }
//    }

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            //Aqui podemos sobre escrever um metodo sem a nescessidade de criar outra classe, bom quando o uso é temporário.
            @Override
            public void walk() {
                System.out.println("Dog Walking");
            }
        };

        animal.walk();
    }
}
