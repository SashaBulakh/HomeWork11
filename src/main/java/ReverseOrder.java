import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrder {

    public static void main(String[] args) {
        final List<String> list = Arrays.asList("my", "name", "is", "sasha", "bulakh");

        final List<String> result = list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result.toString().replaceAll("^\\[|\\]$", ""));
    }
}
