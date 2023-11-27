package Proekt6;
import java.util.Scanner;
public class Kamata {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
	
		int depozit, kamata, kamatnastapka;
		int depozit_posle_k, depozit_edna_godina;
		
		System.out.println("Vnesi depozit: ");
		depozit = input.nextInt() ;
		
		System.out.println("Vnesi kamata :");
		kamata=input.nextInt();
		
		depozit_posle_k=((depozit/100)*kamata+depozit);
		System.out.println("Za eden mesec " + depozit_posle_k);
		
		System.out.println("Za edna godina ");
		depozit_edna_godina = depozit_posle_k + ((depozit/100)*kamata* 12 );
		
		System.out.println(depozit_edna_godina );
		
		
		
	
	}

}
