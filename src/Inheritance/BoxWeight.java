package Inheritance;

public class BoxWeight extends Box {
    double weight = 1.1;

    BoxWeight (BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l, double h, double w) {
        // used to initialise values present in parent class
        super(l, h, w); // what is this? call the parent class constructor
//        System.out.println(super.weight);
//        this.weight = weight;
    }
}
 