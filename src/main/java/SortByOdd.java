import one.util.streamex.EntryStream;

import java.util.*;


public class SortByOdd {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("1. Ivan", "2. Sergiy", "3. Petr", "4. Maria", "5. Sasha");

        String filter = EntryStream.of(names)
                .filterKeyValue((index, name) -> index % 2 == 0)
                .values()
                .toList().toString();

        System.out.println(filter.replaceAll("^\\[|]$", "\""));

    }
}


