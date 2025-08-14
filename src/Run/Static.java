package Run;

public class Static {
    static int a;
    static int b;

    static {
        a = 5;
        System.out.println("First static block: a = " + a);

    }

    static {
        b = a * 2;
        System.out.println("Second static block: b = " + b);
    }

    public static void main(String[] args) {
        System.out.println("a = " + a + ", b = " + b);

        System.out.println( " Value od A :" + a);
    }
}
