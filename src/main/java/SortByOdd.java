import one.util.streamex.EntryStream;

import java.util.*;
import java.util.stream.Collectors;


public class SortByOdd {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ivan", "Sergiy", "Petr", "Maria", "Sasha");

        String filter = names.stream()
                .filter(name -> names.indexOf(name) % 2 != 0)
                .map(name -> names.indexOf(name) + ". " + name)
                .collect(Collectors.joining(", "));

        System.out.println(filter);

    }
}


