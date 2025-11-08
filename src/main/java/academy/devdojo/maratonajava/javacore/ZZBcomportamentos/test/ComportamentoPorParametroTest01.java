package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    static private List<Car> cars = List.of(new Car("red", 1998), new Car("black", 2007), new Car("White", 2018));

    public List<Car> getCars() {
        return cars;
    }

    public static void main(String[] args) {
        System.out.println(filterCarBlack(cars));
        System.out.println(filterRedBlack(cars));
        System.out.println(filterCarByColor(cars, "white"));
        System.out.println("----------");
        System.out.println(filterCarByYear(cars,2016));
    }

    // Situação: O cliente pediu pra filtrar todos os carros pretos.
    static List<Car> filterCarBlack(List<Car> cars){
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase("black")){
                filterCar.add(car);
            }
        }
        return filterCar;
    }
    // Situação 2: O cliente pediu pra filtrar todos os carros vermelhos.
    static List<Car> filterRedBlack(List<Car> cars){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase("red")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
    // Situação 3: Depois o cliente pediu pra filtrar todos os carros brancos, cansado de repetir código, você parametrizou a cor.
    static List<Car> filterCarByColor(List<Car> cars, String color){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase(color)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    // Situação 4: Depois o cliente pediu pra filtrar todos os carros produzidos em um certo tempo. Você percebe que nesses métodos, a unica coisa que muda é o if.
    static List<Car> filterCarByYear(List<Car> cars, int year){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    //Problema/Solução: Fazer um metodo que aceita as condiçoes por parametros.

}
