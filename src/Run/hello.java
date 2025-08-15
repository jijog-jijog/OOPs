package Run;

class Test {
     String name;
    public Test(String name){
        this.name = name;
    }
}

public class hello {


    public static void main(String[] args) {
        Test a = new Test("Jijo");
        Test b = new Test("Rogerz");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
