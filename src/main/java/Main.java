import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {


        int[] numbers = {6,9,1,8};
        Arrays.sort(numbers); // [1,6,8,9]
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " : " + numbers[i]);
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(numbers, 6) + " : 6"); // 1
        System.out.println(Arrays.binarySearch(numbers, 10)+ " : 10");
        System.out.println(Arrays.binarySearch(numbers, 3)+ " : 3");
        System.out.println(Arrays.binarySearch(numbers, 2)+ " : 2");
        System.out.println(Arrays.binarySearch(numbers, 1)+ " : 1");

        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(1);
        array.add(2);
        array.add(4);
        array.add(8);
        array.add(6);
        Collections.sort(array);
        array.remove(2);
        array.remove(new Integer(8));
        array.remove(1);





//        String[] array = { "gerbil", "mouse" }; // [gerbil, mouse]
//        List<String> list = Arrays.asList(array); // returns fixed size list
//        list.set(1, "test"); // [gerbil, test]
//        array[0] = "new"; // [new, test]
//        String[] array2 = (String[]) list.toArray(); // [new, test]
//        list.remove(1);
//        list.add("");
//
//        list.remove(0);

//        Lion leo = new Lion();
//        Animal animal = new Animal();
//        leo.printName();
//        System.out.println(leo);
//        System.out.println(animal);
//
//        Lion.SubLion l = new Lion.SubLion();
//        System.out.println(l);

//        System.out.println((Season.SUMMER == Season.valueOf("SUMMER")));
//        Season.SUMMER.printExpectedVisitors();
//
//        Weather.WINTER.printTemperature();
//        System.out.println(Weather.SUMMER.getWeather());
//
//        Season2.SUMMER.pr();

//        Outer outer = new Outer();
//        outer.callSayHello();
//        System.out.println();
//
//        outer.new Inner().sayHello();
//        System.out.println();

//        Outer.Inner

    }
}
