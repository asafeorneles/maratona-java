package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        int[] array = {1, 2, 3, 4, 5};

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        int[][] arrayInt2 = {{0, 0}, {5, 4, 3, 2, 1}, {8, 7, 6, 5, 4, 3, 2, 1}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("-------------------");
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
