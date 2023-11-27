package Proekt2;
import java.util.Scanner;
public class stepen {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Vnesi celziusovi stepeni: ");
		double c = input.nextDouble();
		
		double f=9*c/5+32;
		System.out.println("Celziusovi stepeni se: " +c );
		System.out.println("Celziusovi stepeni vo Farenhajtovi se: " + f );
		
		

	}

}
