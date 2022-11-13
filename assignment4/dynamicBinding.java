package assignment4;

import java.util.*;
abstract class shape{
	double h,l,b;
	Scanner sc=new Scanner(System.in);
	abstract void area();
	void getdata() {
		System.out.println("enter the dimendion 1 :  ");
		h=sc.nextInt();
		System.out.println("enter the dimension 2 :  ");
		b=sc.nextInt();
	}

}
class triangle extends shape{
	void area() {
		getdata();
		double area=0.5*h*b;
		System.out.println(area);
	}
}

class Square extends shape{
	void area() {
		getdata();
		double area=h*h;
		System.out.println(area);
	}
	double h;
	Scanner sc=new Scanner(System.in);
	void getdata() {
		System.out.println("enter the side of square :  ");
		h=sc.nextInt();
	}
}

class Rectangle extends shape{
	void area() {
		getdata();
		double area=h*b;
		System.out.println(area);
	}
}

class Circle extends shape{
	void area() {
		getdata();
		double area=(3.14)*h*h;
		System.out.println(area);
	}
	double h;
	Scanner sc=new Scanner(System.in);
	void getdata() {
		System.out.println("enter the radius of circle :  ");
		h=sc.nextInt();
	}
	
}


public class dynamicBinding {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a;
		while(true) {
			System.out.println("1.area of triangle : ");
			System.out.println("2.area of square : ");
			System.out.println("3.area of rectangle : ");
			System.out.println("4.area of circle : ");
			System.out.println("5.exit. ");
			a=sc.nextInt();
			if(a==1) {
				shape t=new triangle();
				t.area();
			}
			else if(a==2) {
				shape s=new Square();
				s.area();
			}
			else if(a==3) {
				shape r=new Rectangle();
				r.area();
			}
			else if(a==4) {
				shape c=new Circle();
				c.area(); 
			}
			else {
				break;
			}
		}
		sc.close();
	}
}
