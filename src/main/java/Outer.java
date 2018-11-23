public class Outer {

    private String  hello = "hi";

    protected class Inner {

        void sayHello() {
            for (int i = 0; i < 3; i++) {
                System.out.println(hello);
            }
        }
    }

    public void callSayHello() {
        Inner inner = new Inner();
        inner.sayHello();

    }
}
