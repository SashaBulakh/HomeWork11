import java.util.*;
import java.util.stream.Collectors;

public class SortByOdd {
    private static List<Names> names = new ArrayList<>(Arrays.asList(new Names(1, "1. Ivan"),
            new Names(2, "2. Sergiy"),
            new Names(3, "3. Petr"),
            new Names(4, "4. Maria"),
            new Names(5, "5. Sasha")
    ));
    public static void main(String[] args) {

        List<String> filter = names.stream()
                .filter(names -> names.getNumber() % 2 != 0)
                .sorted(Comparator.comparingInt(Names::getNumber))
                .map(Names::getName)
                .collect(Collectors.toList());

        System.out.println(filter.toString().replaceAll("^\\[|\\]$", ""));
    }
}

class Names{
    private Integer number;
    private String name;

    public Names(Integer number, String name){
        this.number = number;
        this.name = name;
    }

    public Names(String name){
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Names{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}



