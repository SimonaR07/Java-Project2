package Proekt4;
import java.util.Scanner;
public class Proizvod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vcitajte broj na clenovi vo niza: ");
		int n=input.nextInt();
		
		int niza[]=new int[n];
        System.out.println("Vcitaj clenovi vo nizata: ");
        for( int i=0; i<niza.length; i++) {
        	System.out.println(i + "-->");
        	niza[i]=input.nextInt();
        }
        
        double p=1;
        for(int i=0; i<niza.length; i++)
        {
        	p=p*niza[i];
        }
        System.out.println("p = " + p);
	}

}
