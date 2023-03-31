import java.util.*;
import java.util.stream.Collectors;

public class GlueAndSort {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String str = String.join(",", array);


        List<String> list = Arrays.asList(str.split("\\s+|,\\s*")).stream()
                .sorted()
                .collect(Collectors.toList());


        System.out.println(list.toString().replaceAll("^\\[|]$", "\""));
    }
}
