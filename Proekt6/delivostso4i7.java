package Proekt6;
import java.util.Scanner;
public class delivostso4i7 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Da se isprintat clenovi na niza koi se delivi so 4 i 7 ");
		System.out.println("Vnesi broj na clenovi na niza: ");
		int n=input.nextInt();
		
		int niza[]=new int[n]; // treba li da stoi tuka???
		for(int i=1; i<=n; i++) {
			if(i%4==0 && i%7==0) {
				System.out.println(i);
			}
		}

}
}
