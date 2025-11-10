package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();

        ProducerRepository.save(producer);
    }
}
