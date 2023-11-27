package Proekt4;
import java.util.Scanner;
public class NajgolemBroj {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vnesi broevi: ");
		int size = scanner.nextInt();
		int[]n = new int[size];
		
		for(int i=0; i<size; i++) {
			n[i]=scanner.nextInt();
		}
		
		int max=n[0];
		for(int i=1; i<size; i++) {
			if(n[i]>max) {
				max=n[i];
			}
		}
               System.out.println(max);
	}

}
