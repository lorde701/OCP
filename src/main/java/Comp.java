import java.util.*;
import java.util.function.BiFunction;

public class Comp<T> {
    TreeSet<Animal> animals = new TreeSet<>();

    T t;

    public Comp(T t) {
        this.t = t;
    }

    public String toString() {
        return t.toString();
    }

    String s;
    int i;

    String getS() {
        return s;
    }

    int getI() {
        return i;
    }

    class ChainingComparator implements Comparator<Comp> {
        @Override
        public int compare(Comp o1, Comp o2) {
            Comparator<Comp> c = Comparator.comparing(Comp::getS);
            c = c.thenComparingInt(Comp::getI);
            return c.compare(o1, o2);
        }
    }

    public static void main(String[] args) {
//        System.out.print(new Comp<>("hi"));
//        System.out.print(new Comp<>("there"));
//        Map<Integer, Integer> map = new HashMap<>(10);
//
//        List<String> list = new ArrayList<>();
//        list.add("Magician");
//        list.add("Assistant");
//        System.out.println(list); // [Magician, Assistant]
//        list.removeIf(s -> s.startsWith("A"));
//        System.out.println(list); // [Magician]


        BiFunction<String, String, String> mapper = (v1, v2)
                -> v1.length() > v2.length() ? v1 : v2;
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");
        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);
        System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
        System.out.println(jenny); // Bus Tour
        System.out.println(tom); // Skyride

    }


}
