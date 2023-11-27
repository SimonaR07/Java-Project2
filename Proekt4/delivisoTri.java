package Proekt4;
import java.util.Scanner;
public class delivisoTri {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Da se ispecatat: clenovi na niza koi ne se delivi so 3. ");
		System.out.println("Vnesi broj na clenovi vo nizata ");
		int n=input.nextInt();
		
		int niza[] = new int[n];
		System.out.println("Vnesi gi clenovite na nizata: ");
		for(int i=0; i < niza.length; i++) {
		System.out.println(i + "-->");
		niza[i] = input.nextInt();
		}
		for(int i=0; i < niza.length; i++) {
			if(niza[i] % 3 != 0) 
		
				System.out.println(" niza [ " + i + "] = " + niza[i] );
			
			
		}
	}

}
