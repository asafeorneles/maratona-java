package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[]args){

        int idade = 12;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoolica");
        }
        else{
            System.out.println("Desautorizado a comprar bebida");
        }
    }
}
