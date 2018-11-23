import org.apache.commons.lang3.builder.ToStringBuilder;

public class Lion extends Animal {
    String name = "Leo";
    int age = 12;
    int paws = 4;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    static class SubLion extends Lion{
        int fdsf = 5;
    }
}
