import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
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

        Outer outer = new Outer();
        outer.callSayHello();
        System.out.println();

        outer.new Inner().sayHello();
        System.out.println();

//        Outer.Inner

    }
}
