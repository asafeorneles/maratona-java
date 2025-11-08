package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("A", "Letra - A");
        treeMap.put("D", "Letra - D");
        treeMap.put("B", "Letra - B");
        treeMap.put("C", "Letra - C");
        treeMap.put("E", "Letra - E");

        for (Map.Entry<String, String> entry: treeMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(treeMap.headMap("C")); // Traz os elementos abaixo do que a gente passar
        // Retorna o objeto do TreeSet:
        // lower retorna o <
        // floor retorna <=
        // higher retorna o >
        // ceiling retorna o >=

        System.out.println(treeMap.lowerEntry("C"));
        System.out.println(treeMap.floorEntry("C"));
        System.out.println(treeMap.higherEntry("C"));
        System.out.println(treeMap.ceilingEntry("C"));
    }
}
