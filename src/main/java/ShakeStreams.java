import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShakeStreams  {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(10, 14,99,54,24);
        Stream<Integer> stream2 = Stream.of(100,33,109,58,41,83,436,547);

        zip(stream1,stream2)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }

    public static Stream<Integer> zip(Stream<Integer> first, Stream<Integer> second){
        Iterator<Integer> iterator1 = first.iterator();
        Iterator<Integer> iterator2 = second.iterator();
        List<Integer> result = new ArrayList<>();

        while (iterator1.hasNext() && iterator2.hasNext()){
            result.add(iterator1.next());
            result.add(iterator2.next());
        }
        return result.stream();
    }
}
