package Inheri2;

class Box {
    double h, l, w;

    Box(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
        System.out.println("Parent Normal Constructor called");
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
        System.out.println("Parent Copy Constructor called");
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double h, double l, double w, double weight) {
        super(h, l, w); // calls parent normal constructor
        this.weight = weight;
        System.out.println("Child Normal Constructor called");
    }

    BoxWeight(BoxWeight other) {
        super(other); // calls parent copy constructor
        this.weight = other.weight;
        System.out.println("Child Copy Constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(10, 20, 30, 5.5); // Normal constructor chain
        BoxWeight b2 = new BoxWeight(b1);              // Copy constructor chain
    }
}
