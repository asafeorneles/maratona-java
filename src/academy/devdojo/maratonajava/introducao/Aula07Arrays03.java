package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        int [] numeros = new int [5];
        int [] numeros2 = {1,2,3,4,5};
        int [] numeros3 = new int [] {5,4,3,2,1};

//        for (int i = 0; i < numeros3.length; i++) {
//            System.out.println(numeros3[i]);
//        }
//        O numeros3.length busca o valor equivalente ao tamanho de espaço do array. No caso, 5.

        for(int num : numeros3){
            System.out.println(num);
        }

//        O que esta acontecendo no foreach:
//        int num = numeros3[0];
//        System.out.println(num);
//        num = numeros3[1];
//        System.out.println(num);
//        num = numeros3[2];
//        System.out.println(num);
//        ...

    }
}
