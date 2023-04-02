import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrder {

    public static void main(String[] args) {
        final List<String> list = Arrays.asList("my", "name", "is", "sasha", "bulakh");

        String filter = list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));

        System.out.println(filter);
    }
}
