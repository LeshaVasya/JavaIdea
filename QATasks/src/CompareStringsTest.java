public class CompareStringsTest {
    public static void main(String[] args) {
        String a = "Car";
        String b = "Car";
        String c = new String("Car");
        String d = new String("Car");
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
    }
}
