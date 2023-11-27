package Proekt3;
import java.util.Scanner;
public class Zadaca {

	public static void main(String[] args) {
		
		Scanner tastatura = new Scanner(System.in);
		int x,y,z;
		
		System.out.println("Vnesi vrednost za x: ");
		x=tastatura.nextInt();
		
		System.out.println("Vnesi vrednost za y: ");
		y=tastatura.nextInt();
		
		System.out.println("Vnesi vrednost za z: ");
		z=tastatura.nextInt();
		
		if(x>y ||  z>y) 
			System.out.println("1");
		else 
			System.out.println("2");
		
		if(Math.abs(x-y)>=z)
			if(x>y)
				System.out.println("3");
			else
				System.out.println("4");	
		else
			System.out.println("5");

	}

}
