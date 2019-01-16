import java.util.function.*;

interface Gorilla {
    String move();
}

class GorillaFamily<L> {
    private String walk = "walk";

    void everyonePlay(boolean baby) {
        String approach = "amble";
        //approach = "run";

        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);
    }

    private void play(Gorilla g) {
        System.out.println(g.move());
    }
    BiFunction<String, String, String> b;
    UnaryOperator<Long> ex2 = (Long x) -> x;
}