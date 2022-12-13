package oops;
// Inheritance :- It is the ability of an object to acquire the properties of another class.

class shape{
    public void area()
    {
        System.out.println("displays area");

    }
}
// "triangle" class ne "shape" class ke properties ko le liya 
class Triangle extends shape{
    public void area(int l, int h)
    {
        System.out.println(1/2*l*h);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l,int h)
    {
        System.out.println(1/2*l*h);
    }
}
public class inheritance {
    public static void main(String[] args) {
        
    }
}
