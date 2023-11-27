package Proekt1;
import java.util.Scanner;
public class Broj {

	public static void main(String[] args) {
		int prvacifra, tretacifra, broj, zbir;
		Scanner tastatura= new Scanner(System.in);
		
		System.out.println("Vnesi tricifren broj: ");
		broj=tastatura.nextInt();
		
		prvacifra = broj / 100;
		tretacifra = broj % 10;
		zbir = prvacifra + tretacifra;
		
		if(zbir%2==0) {
			System.out.println("Zbirot na prvata i tretata cifra e paren. ");
		} else {
			System.out.println("Zbirot na prvata i tretata cifra  neparen. ");
		}
		
		

	}

}
