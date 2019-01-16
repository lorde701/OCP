interface Interf {
    boolean isTooHigh(int height, int limit);
}

class Climber {
    public static void main(String[] args) {
        check((c, h) -> c > h, 11);
    }
    private static void check(Interf climb, int height) {
        if (climb.isTooHigh(height, 10)) // x2
            System.out.println("too high");
        else System.out.println("ok");
    }
}