import java.util.*;
import java.util.stream.Collectors;

public class GlueAndSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1, 2, 0", "4, 5");


        String filter = list.stream()
                .map(s -> s.split(", "))
                .flatMap(Arrays::stream)
                .map(Integer::valueOf)
                .sorted()
                .map(num -> String.valueOf(num))
                .collect(Collectors.joining(", "));


        System.out.println(filter);
    }
}
