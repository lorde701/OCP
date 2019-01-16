import java.util.ArrayList;
import java.util.List;

public class Generics {

    static class Sparrow extends Bird {}
    static class Bird {}

//
//    <Sparrow extends Bird> Sparrow method3(List<Sparrow> list) {
//        return new Sparrow(); // DOES NOT COMPILE
//    }
//
//    public static void main(String[] args) {
//        List<? extends Bird> list = new ArrayList<Bird>();
//        list.add(new Sparrow());
//
//        List<? extends Number> list2 = new ArrayList<Integer>();
//        list2.add(new Integer(5));
//    }

}
