import java.util.*;
import java.util.stream.Collectors;

public class GlueAndSort {
    public static void main(String[] args) {
        String [] array = {"1, 2, 0", "4, 5"};
        String str =  String.join(",", array);
        String [] newArray = str.split("\\s+|,\\s*");

        System.out.println(Arrays.toString(newArray));

       final List<String> list = Arrays.asList(newArray);
       List<Integer> newList = list.stream()
               .map(s -> Integer.parseInt((s)))
               .collect(Collectors.toList());

       newList.sort(Comparator.naturalOrder());

       System.out.println(newList);
   }
}
