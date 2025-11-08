package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    static private List<Car> cars = List.of(new Car("red", 1998), new Car("black", 2007), new Car("White", 2018));
    static private List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

    public List<Car> getCars() {
        return cars;
    }

    public static List<Integer> getNumbers() {
        return numbers;
    }

    public static void main(String[] args) {
        List<Car> carsYearBefore = filter(cars, car -> car.getYear() < 2016);
        System.out.println(carsYearBefore);

        // Agora como nosso metodo recebe qualquer tipo,qualquer comportamento, é possivel fazer com listas de todos os tipos.
        List<Integer> evenNumbers = filter(numbers, num -> num % 2 == 0);
        System.out.println(evenNumbers);
    }

    // Vamos supor que queiramos fazer um metodo mais genérico ainda que atenda vários tipos de listas e com a condição personalizável.
    static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }

}
