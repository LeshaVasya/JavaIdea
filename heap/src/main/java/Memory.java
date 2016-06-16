/**
 * @author avasiliev
 * @project heap
 * @since 2016-06-16
 */
public class Memory {
    public static void main(String args[]) {
        int x = 0;
        int[] arr = new int[]{20};
        f(x, arr);
        System.out.println("1) x = "+x+" arr[0] = "+arr[0]);
        g(x, arr);
        System.out.println("2) x = "+x+" arr[0] = "+arr[0]);
    }

    private static void f(int x, int[] arr) {
        x += 30;
        arr[0] = 40;
    }


    private static void g(int x, int[] arr) {
        x = 50;
        arr = new int[]{60};
    }
}
