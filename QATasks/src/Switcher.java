public class Switcher {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
                break;
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }
    }
}
