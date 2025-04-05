package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais01 {
    public static void main(String[] args) {
        int [][] dias = new int [3][4];

        dias [0][0] = 1;
        dias [0][1] = 2;
        dias [0][2] = 3;
        dias [0][3] = 4;

        dias [1][0] = 5;
        dias [1][1] = 6;
        dias [1][2] = 7;
        dias [1][3] = 8;

        dias [2][0] = 9;
        dias [2][1] = 10;
        dias [2][2] = 11;
        dias [2][3] = 12;

//        for (int i = 0; i < dias.length; i++){
//            for (int j = 0; j < dias[i].length; j++){
//                System.out.println(dias[i][j]);
//            }
//        }

        for (int [] arrBase : dias){
            for (int num : arrBase){
                System.out.println(num);
            }
        }

//        O que esta acontecendo
//        int [] arrBase = dias [0] -> (1,2,3,4)
//
//        int num = arrBase[0] -> 1
//        System.out.println(num);
//        num = arrBase[1] -> 2
//        System.out.println(num);
//        num = arrBase[2] -> 3
//        System.out.println(num);
//        num = arrBase[3] -> 4
//        System.out.println(num);
//
//        arBase = dias [1] -> (5,6,7,8)
//
//        num = arBase [0] -> 5
//        System.out.println(num);
//        num = arBase [1] -> 6
//        System.out.println(num);
//        num = arBase [2] -> 7
//       System.out.println(num);
//        num = arBase [3] -> 8


    }
}
