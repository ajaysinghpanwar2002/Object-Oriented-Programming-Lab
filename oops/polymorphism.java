package oops;

// Polymorphism :- It is the ability of an object to behave in different form according to the message passed to it. In java it is implimentes due to function over loading 
class Students {
    String name;
    int age;
    // dekho function ka name same rakh diya h bas parmeter different kr diya h.
    public void printInfo(String name)
    {
        System.out.println(name);
    }
    public void printInfo(int age)
    {
        System.out.println(age);
    }
    public void printInfo(String name, int age)
    {
        System.out.println(name+ " "+ age);
    }

}
public class polymorphism {
    public static void main(String args[])
    {
        Students s1 = new Students();
        s1.name="ajay";
        s1.age = 20;
        // and jab ham change krenge according to paramters, compiler will know mein konsa function bula rha hun 
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);
    }
}
