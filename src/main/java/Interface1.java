public interface Interface1 {
    default void method() {
        System.out.println(this.getClass());
    }
}
