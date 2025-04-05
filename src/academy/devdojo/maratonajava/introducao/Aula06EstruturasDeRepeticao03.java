package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50.


        for (int i = 0; i <= 50; i++){
            if(i < 25){
                System.out.println(i);
            }
        }

        for (int j = 0; j <= 50; j++) {
            if(j > 25){
                break;
            }
            System.out.println("Com o break: "  + j);
        }
    }
}
