package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 7.9, 9.9);
//        box1.getL();
//        Box box2 = new Box(box1);
//        System.out.println(box1.w + " " + box1.h);
//        System.out.println(box2.w + " " + box2.h);
//
//        BoxWeight box3 = new BoxWeight(4,7,5);
//        BoxWeight box4 = new BoxWeight(2, 3, 4);
//        System.out.println(box3.h + " " + box3.weight);
//
//
        Box box5 = new BoxWeight(2, 3, 4);
//        System.out.println(box5.weight);
        System.out.println(box5.h);

//        BoxWeight box4 = new Box(2, 3, 4);
//        System.out.println(box4.w);



        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6.weight);
//        System.out.println(box6.l);

//        Box.greeting();

    }
}
