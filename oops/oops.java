package oops;

// basically ek class bna di h 
class Pen {
    // class ke kuch properties h 
    String color;
    String Type;

    // class mein 1 funtion bhe bna diya , "write"
    public void write() {
        System.out.println("write something...");
    }

    // printcolor function bhe bna diya, 
    public void printColor()
    {
        // isme "this" ka use kiya h jo objet usey call krega uski props print karega 
        System.out.println(this.color);
    }
}

// ab 1 student class bna de 
class Student{
    // class ke kuch properties
    String Name;
    int age;
    String Gender;

    // ab is "printInfo" function ke andar 2 cheeze print hogi 
    public void printInfo(){
        System.out.println(this.Name);
        System.out.println(this.age);
        System.out.println(this.Gender);
    }

    // 1 non-parameterized constructor bna diya h
    Student()
    {
        System.out.println("constructor called");
    }

    // parameterized constructor bna diya h 
    Student(String Name, int age)
    {
        this.Name = Name;
        this.age = age;
    }


}

// yeh apni main class h, file name same rkhna h 
public class oops {
    // yeh apna main function h 
    public static void main(String args[]) {
        
        // "pen1" ek object bnaya h "Pen" clss ka 
        Pen pen1 = new Pen();
        // us object ko ab properties bhe assign kr de h 
        pen1.color = "red";
        pen1.Type = "gel";

        Pen pen2 = new Pen();
        pen2.color="pink";
        pen2.Type="ball";

        // ab yahan se "printcolor" function ko call kiya ja rha h 
        pen1.printColor();
        pen2.printColor();

        // 1 aur student class ka object s1 . 

        // Student s1 = new Student();
        // s1.Name = "aman";
        // s1.age = 20;

        Student s2 = new Student("raj",21) ;
        s2.Gender = "male";

        // so yeh basically kuch nhe kr rha h, bas us object ke properties ko print krna iska kaam h 
        s2.printInfo();

    }
}
