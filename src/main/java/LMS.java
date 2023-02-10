import java.util.stream.Collectors;
import java.util.stream.Stream;


public class LMS {
    public static void main(String[] args) {
        Random random = new Random(25214903917L, 11L, (long) Math.pow(2, 48));

        Stream<Long> result = Stream.iterate(0L, (seed) -> random.next(seed));
        result.limit(100)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
    class Random {
        private final long a, c, m;

        private long seed;

        public Random seed(long seed) {
            this.seed = seed;
            return this;
        }

        public Random(long a, long c, long m) {
            this.a = a;
            this.c = c;
            this.m = m;
        }

        public long next(long seed) {
            return (a * seed + c) % m;
        }
    }



