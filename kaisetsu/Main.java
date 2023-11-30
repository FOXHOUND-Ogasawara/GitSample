package kaisetsu;
public class Main {
    public static void main(String[] args) {
        AccessSample as = new AccessSample(10, 5);

        as.setTate(6);

        System.out.println(as.getTate() + "*" + as.getYoko() + "=" + as.calc());
        AccessSample.sample();
    }
}
