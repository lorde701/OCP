import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

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

        Stream<String> stream = Stream.of("Aasdasd", "dasdjaflkjladjo", "a;dlkaskpjsdpl", "adkf", "fdcsoifdjsj", "sddllsdjf", "sad", "dffw", "2wertyfd");

        TreeSet<String> arrayList = stream
//                .filter(x -> x.length() > 6)
                .collect(TreeSet::new,
//                        (x, y) -> x.add(y),
                        TreeSet::add,
//                        (x, y) -> x.addAll(y));
                        TreeSet::addAll);
        System.out.println(arrayList);

    }
}
