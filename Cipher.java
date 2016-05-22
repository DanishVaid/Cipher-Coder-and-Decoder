//Caesar Cipher Coder, decoder, and breaker 
import java.util.*;
public class Cipher{
	public static void main(String[] args){
		System.out.println("Running Cipher Code . . .");
		Scanner inp = new Scanner(System.in);
		System.out.println("Do you want to make (Key 1) or break (Key 2) a Cipher Encryption Code?");
		int c = inp.nextInt();
		int p = 1;		

		System.out.println("Enter Phrase:");
		String phrase = inp.nextLine();

		while(p == 1){
			if(c == 1){
				System.out.println("Value of N");
				int n = inp.nextInt();
				System.out.println("Encrypted is: \n" +"   " + encrptor(phrase, n) );
			}

			else if(c == 2){

				System.out.println("Solved is: \n" +"   " + breaker(phrase) ); //MAKE PRINT ARRAY
			}

			else{
				System.out.println("Incorrect Entry");
				System.out.println("Do you want to Re-run (Key 1) or Exit (Key 2)");
				p = inp.nextInt();
			}
		} 

		System.out.println("----------------------------------\n    Done!");

	}

	public static String encrptor(String x, int n){
		char[] phrase = x.toCharArray();
		for(int i = 0; i < x.length(); i++ ){
			phrase[i] += n;
			if( phrase[i] < 'z'){
				phrase[i] = (char)(phrase[i] % 'z');
			}
		}
		String encrypted = new String(phrase);
		return encrypted;		
	}

	public static String breaker(String x){
		char[] phrase = x.toCharArray();

		for(int i = 0; i < 26; i++){

			for(int j = 0; j < x.length(); j++){

				phrase[j] += i;
				if (phrase[i]>'z'){
					phrase[i] = (char)(phrase[i] % 'z');
				}
			}
		}
		String solved =new String(phrase);
		return solved;
	}

}