package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("madhouse").build();

//        ProducerService.save(producer);
//        ProducerService.delele(6);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("o");
//        List<Producer> producers = ProducerService.findAll2();
//        log.info("Producers found: '{}'", producers);
//        ProducerService.showProducerMetadata();
//        ProducerService.showDriverMetadata();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpper("deen");
//        List<Producer> producers = ProducerService.findByNameAndInserteWhenNotFound("A1-Pictures");
//        log.info("Producers found: '{}'", producers);
//        ProducerService.findByNameAndDelete("A1");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("B");
//        log.info("Producers found: '{}'", producers);
//        ProducerService.updatePreparedStatement(producerToUpdate);

        List<Producer> producers = ProducerService.findByNameCallableStatement("Bo");
        log.info("Producers found: '{}'", producers);

    }


}
