import javafx.util.Pair;

import java.time.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


//        LocalDate date = LocalDate.of(2015, 5, 25);
//        LocalTime time = LocalTime.of(11, 55, 00);
//        ZoneId zone = ZoneId.of("US/Eastern");
//        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
//        Instant instant = zonedDateTime.toInstant(); // 2015–05–25T15:55:00Z
//        System.out.println(zonedDateTime); // 2015–05–25T11:55–04:00[US/Eastern]
//        System.out.println(instant); // 2015–05–25T15:55:00Z
//        Instant i = Instant.now();
//        System.out.println(i);

//        StringBuilder b = new StringBuilder();
//        b.append(12345).append('-');
//        StringBuilder b2 = b.reverse();
//        System.out.println(b.toString()); // -54321
//        System.out.println(b == b2); // true

//        int i = Integer.MAX_VALUE;
//        System.out.println(i);
//        System.out.println(i + 1);
//        System.out.println(i + 2);
//        System.out.println(i + 2);
//        System.out.println(i + 1 == -2147483648);


//        Pattern p = Pattern.compile("\\[((((\\d+)|\\d+-(\\d+|\\*));*)+)\\]");
//        Matcher m = p.matcher("17) Процесс 11[5-6]\n" +
//                "17) Процесс 11[5-6;1-2]\n" +
//                "17) Процесс 11[5-6;1-*]\n" +
//                "17) Процесс 11[5-6;1-*]\n" +
//                "17) Процесс 11[5-6;1-*]\n" +
//                "17) Процесс 11[5-6;1-*]\n" +
//                "17) Процесс 11[5-6;1-*]\n" +
//                "17) Процесс 11[5-6;1-*]\n" +
//                "17) Процесс 11[5-6;1-*]\n" +
//                "17) Процесс 11[5-6;1-*]\n" +
//                "17) Процесс 11[5-*;1-2]\n" +
//                "17) Процесс 11[5-6;1-*]\n" +
//                "17) Процесс 11[5;6;8]");
//        while (m.find())
//            System.out.println(m.group());

//        Locale locale = Locale.getDefault();
//        System.out.println(locale);
//        System.out.println(Locale.FRANCE);

        System.out.println(Locale.getDefault()); // en_US
        Locale locale = new Locale("fr");
        Locale.setDefault(locale); // change the default
        System.out.println(Locale.getDefault()); // fr


        A a = new B();
        a.getClassName();
        a.getsmhdgjs();
    }

    static class A {
        void getClassName() {
            System.out.println("A");
        }
    }

    static class B extends A {
        @Override
        void getClassName() {
            System.out.println("B");
        }

        void getsmhdgjs() {
            System.out.println("sdfjh");
        }
    }

    private static void threeDigit(Optional<Integer> optional) {
        optional.map(n -> "" + n) // part 1
                .filter(s -> s.length() == 3) // part 2
                .ifPresent(System.out::println); // part 3
    }
}
