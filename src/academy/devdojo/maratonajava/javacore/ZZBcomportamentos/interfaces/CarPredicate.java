package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;

public interface CarPredicate {
    //Metodo de teste que retorna um boolean (Em interfaces, nao construimos o metodo)
    boolean test(Car car);
}
