package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    static private List<Car> cars = List.of(new Car("red", 1998), new Car("black", 2007), new Car("White", 2018));

    public List<Car> getCars() {
        return cars;
    }

    public static void main(String[] args) {
//        List<Car> redCars = filterCars(cars, new CarPredicate() { // Passamos o CarPredicate como parametro.
//            //Aqui construimos o metodo usando classe anonima, definimos a condiçao para o boolean.
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equalsIgnoreCase("red");
//            }
//        });

        // Forma muito mais simples sem ter que criar um nova interface anônima, apenas usando lambda expression (O codigo nao quebra pois o lambda expression é compatível com o CarPredicate)
        List<Car> redCars = filterCars(cars, car -> car.getColor().equalsIgnoreCase("red"));
        System.out.println(redCars);
    }

    static List<Car> filterCars(List<Car> cars, CarPredicate carPredicate){
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){ //Aqui chamamos o metodo do nosso carro pradicate para entrar em acao. (Se verdadeiro, adiciona na lista filtrada).
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
