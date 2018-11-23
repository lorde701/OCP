public class HashCodeEquals {

    public int a;
    public String f, d;

    @Override
    public boolean equals(Object obj) {
        HashCodeEquals h = (HashCodeEquals)obj;
        return (h.f.equals(this.f));
    }

    @Override
    public int hashCode() {
        return a;
    }
}
