package oops;

// multiple inheritance krne ke liye java mein interface h 
// you cannot make constructor of interfaces 
// idhar sirf define kiya h koi function 
interface Animale {
    void walk();
}

interface Herbivore {

}

// idhar implement kiya h, jisse upar define kiya tha, idhar multiple inheritance bhe kr diya h. matlab ek class ke pass dono class se data aa rha h 
class Horsie implements Animale, Herbivore {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Horsie horse = new Horsie();
        horse.walk();
    }
}
