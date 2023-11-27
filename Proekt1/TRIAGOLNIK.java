package Proekt1;
import java.util.Scanner;
public class TRIAGOLNIK {

	public static void main(String[] args) {
	int a,b,c;	
Scanner tastatura = new Scanner (System.in);

System.out.println("Vnesi vrednost za a: ");
 a=tastatura.nextInt();
 System.out.println("Vnesi vrednost za b: ");
 b=tastatura.nextInt();
 System.out.println("Vnesi vrednost za c:");
 c=tastatura.nextInt();
 
 if(a+b>c && a+c>b && b+c>a ){
	 System.out.println("Moze da se formira triagolnik.");
 } else {
	 System.out.println("Ne moze da se formira triagolnik.");
	 System.exit(0);
 }
 
 if(a*a+b*b==c*c && b*b+c*c==a*a && c*c+a*a==b*b) {
	 System.out.println("Triagolnikot e pravoagolen.");
	 
 }
 
 else if (a*a+b*b>c*c && b*b+c*c>a*a && c*c+a*a>b*b) {
	 System.out.println("Triagolnikot e ostroagolen");
 }
 
 else {
	 System.out.println("Triagolnikot e tapoagolen");
 }
	}

}
