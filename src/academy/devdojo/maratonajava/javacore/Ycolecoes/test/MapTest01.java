package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Teklado", "Teclado");
        map.put("Mouze", "Mouse");
        map.put("vc", "Você");
        map.put("vc2", "Você");

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println("-------Chave ou chave e valor-------");

        for (String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("--------Valor--------");

        for (String value : map.values()){
            System.out.println(value);
        }

        System.out.println("-------------");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}
