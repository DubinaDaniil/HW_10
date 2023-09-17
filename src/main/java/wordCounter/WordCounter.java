package wordCounter;

import workWithFiles.FileReader;

import java.io.*;
import java.util.*;

public class WordCounter {

    FileReader fileReader = new FileReader();
    HashMap<String, Integer> map = new HashMap<>();
    String[] mass = fileReader.readFileOneLine(new File("src/main/resources/wordCounter/words.txt")).split(" ");

    public HashMap<String, Integer> createMap() {
        for (final String s : mass) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                final int temp = map.get(s);
                map.replace(s, temp + 1);
            }
        }
        return map;
    }

    public void sorted() {
        final HashMap<String, Integer> mapToSort = createMap();
        mapToSort.entrySet().stream()
                .sorted(HashMap.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
