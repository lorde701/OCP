import java.time.*;
import java.util.*;

public class Steps {

    public static void main(String[] args) {
//        Stream<Integer> stream = Stream.of(3, 5, 6);
//        System.out.println(stream.reduce(1, (a, b) -> a*b));


//        Stream<String> stream = Stream.of("w", "o", "l", "f");
//        StringBuilder word = stream.collect(StringBuilder::new,
//                StringBuilder::append, StringBuilder::append);
//        System.out.println(word);


//        Stream<String> stream = Stream.of("w", "o", "l", "f");
//        TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add,
//                TreeSet::addAll);
//        System.out.println(set); // [f, l, o, w]

//        Stream<String> stream = Stream.of("Aasdasd", "dasdjaflkjladjo", "a;dlkaskpjsdpl", "adkf", "fdcsoifdjsj", "sddllsdjf", "sad", "dffw", "2wertyfd");
//
//        TreeSet<String> arrayList = stream
////                .filter(x -> x.length() > 6)
//                .collect(TreeSet::new,
////                        (x, y) -> x.add(y),
//                        TreeSet::add,
////                        (x, y) -> x.addAll(y));
//                        TreeSet::addAll);
//        System.out.println(arrayList);


//        IntStream stream = IntStream.rangeClosed(1,10);
//        OptionalDouble optional = stream.average();
//        optional.ifPresent(System.out::println);
//        System.out.println(optional.getAsDouble());
//        System.out.println(optional.orElseGet(() -> Double.NaN));

//       threeDigit(Optional.of(944444));

//        Object o1 = new Object();
//        Object o2 = new Object();
//        Predicate<? super String> predicate = s -> s.length() > 3;
//        Stream<Object> s = Stream.of(o1, o2);
//        boolean b = s.anyMatch(predicate);

//        Predicate<? super String> predicate = s -> s.length() > 3;
//        Stream<String> stream = Stream.iterate("-", (s) -> s + s);
//        boolean b1 = stream.noneMatch(predicate);
//        boolean b2 = stream.anyMatch(predicate);
//        System.out.println(b1 + " " + b2);

//        Stream<Integer> s = Stream.of(1);
//        IntStream is = s.mapToInt(x -> x);
//        DoubleStream ds = s.mapToDouble(x -> x);
//        Stream<Integer> s2 = ds.mapToInt(x -> x);
//        s2.forEach(System.out::print);

//        Stream<String> s = Stream.empty();
//        Stream<String> s2 = Stream.empty();
////        Stream<String> s2 = Stream.of("cdsd", "cdks", "rt");
//        Map<Boolean, List<String>> p = s.collect(
//                Collectors.partitioningBy(b -> b.startsWith("c")));
//        Map<Boolean, List<String>> g = s2.collect(
//                Collectors.groupingBy(b -> b.startsWith("c")));
//        System.out.println(p + " " + g);


//        DoubleStream s = DoubleStream.of(1.2, 2.4);
//        s.peek(System.out::println).filter(x -> x > 2).count();


//        ZoneId.getAvailableZoneIds().stream()
//                .filter(z -> z.contains("Europe") || z.contains("Russia"))
//                .sorted()
//                .forEach(System.out::println);




        Period wr = Period.ofYears(1).plusMonths(2);
        System.out.println(LocalDate.now().plus(wr));
        Period wrong = Period.ofYears(1).ofWeeks(1);


    }

    private static void threeDigit(Optional<Integer> optional) {
        optional.map(n -> "" + n) // part 1
                .filter(s -> s.length() == 3) // part 2
                .ifPresent(System.out::println); // part 3
    }
}
