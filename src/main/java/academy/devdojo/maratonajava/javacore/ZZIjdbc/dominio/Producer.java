package academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value // Torna a classe imutavel
@Builder // Cria um Builder para nossa classe
public class Producer {
    private Integer id;
    private String name;

}
