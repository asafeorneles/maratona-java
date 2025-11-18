package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void delele (Integer id){
        checkId(id);
        ProducerRepository.delete(id);
    }

    public static void update (Producer producer){
        checkId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll (){
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName (String name){
        return ProducerRepository.findByName(name);
    }

    public static List<Producer> findAll2 (){
        return ProducerRepository.findAll2();
    }

    public static void showProducerMetadata (){
        ProducerRepository.showProducerMetadata();
    }

    public static void showTypeScrollWorking (){
        ProducerRepository.showTypeScrollWorking();
    }

    public static void showDriverMetadata (){
        ProducerRepository.showDriverMetadata();
    }

    private static void checkId(Integer id){
        if (id == null || id <= 0){
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
