package oops;

//  Encapsulation :- Wrapping up of data member (variables) and member function (method) together into a single unit called is known as encapsulation 
//  Abstraction :- It is the act of representing essential features of class without including the background details.

// abstract keyword lga ke class ko abstract bna diya, abstract matlab yeh sirf ek concept h, you cannot create a object of this class. 
abstract class Animal {
    // yeh function jiske aage abstract lga diye usey ab explain krne ke jarurat nhe h 
    abstract void walk();
    // and iske andar dono function ban sakte h, both abstract and public. 
    public void eats()
    {
        System.out.println("animal Eats");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk(); 
        horse.eats();
    }
}
