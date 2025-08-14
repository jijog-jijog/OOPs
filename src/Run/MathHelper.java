package Run;

class Main {
    static int add(int a, int b) {
        return a + b;
    }

    public void greeting() {

    }
}

public class MathHelper {
    public static void main(String[] args) {
        // Call the method without creating a Main object
        int sum = Main.add(3, 4);
        System.out.println(sum); // 7
    }
}