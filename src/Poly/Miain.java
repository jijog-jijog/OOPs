package Poly;

class Student {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
public class Miain {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Alice");
        System.out.println(s.getName());
    }
}

