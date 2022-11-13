package assignment1;
import java.util.*;

public class Complex{
	int real;
	int img;
	Scanner sc = new Scanner(System.in);
	void getdata() {
		System.out.println("enter Real");
		real = sc.nextInt();
		System.out.println("enter imaginary");
		img = sc.nextInt();
		}
	Complex add(Complex c1, Complex c2) {
		Complex c3 = new Complex();
		c3.real = c1.real + c2.real;
		c3.img = c1.img + c2.img;
		return c3;
	}
	Complex sub(Complex c1,Complex c2) {
		Complex c3 = new Complex();
		c3.real = c1.real - c2.real;
		c3.img = c1.img - c2.img;
		return c3; 
	}
	Complex mul(Complex c1,Complex c2) {
		Complex c3 = new Complex();
		c3.real = (c1.real*c2.real)-(c1.img * c2.img);
		c3.img = (c2.img*c1.real)+(c1.img*c2.real);
		return c3;
	}
	
	Complex div(Complex c1,Complex c2) {
		Complex c3 = new Complex();
		c3.real = ((c1.real*c2.real)+(c1.img*c2.img))/((c2.real*c2.real)+(c2.img*c2.img));
		c3.img = ((c1.img*c2.real)-(c2.img*c1.real))/((c2.real*c2.real)+(c2.img*c2.img));
		return c3;
	}
	
	
	void putdata() {
		System.out.println("real = "+real+" imaginary = "+img);
	}
	
	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		Complex c3 = new Complex();
		int choice;
		Scanner sc = new Scanner(System.in);

		c1.getdata();
		c2.getdata();
		

		do {
			System.out.println("choose the operation you want to perform "
					+ "1:Addition  "
					+ "2:Subtraction  "
					+ "3:Multiplication  "
					+ "4:Division  "
					+ "0:End   ");
			
			System.out.println("enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				c3 = c3.add(c1, c2);
				System.out.println("the addition is ");
				c3.putdata();
				break;
			case 2 :
				c3 = c3.sub(c1,c2);
				System.out.println("the subtraction is ");
				c3.putdata();
				break;
			case 3 :
				c3 = c3.mul(c1, c2);
				System.out.println("the multiplication is ");
				c3.putdata();
				break;
			case 4 :
				
				System.out.println("the division is ");
				if(((c2.real*c2.real)+(c2.img*c2.img)) !=0  ) {
					c3 = c3.div(c1,c2);
					c3.putdata();
				}
				else {
					System.out.println("division by zero is not allowed");
				}
				
				
			};
			}
		
		while (choice !=0 ) ;		
		
		

	}
}
