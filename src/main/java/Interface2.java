public interface Interface2 {
    default void method() {
        System.out.println(":)");
        System.out.println(this.getClass());
    }
}
