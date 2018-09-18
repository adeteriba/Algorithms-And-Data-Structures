//Print out all the prime numbers less than a given number N using Sieve of Eratosthenes
import java.util.*;

public class SieveofEratosthenes {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int str = sc.nextInt();
		sc.close();
		
		//Initialize the number array
		boolean[] isPrime = new boolean[str];
		isPrime[0] = false; 	//1 is not a prime number
		for(int i=1;i<str;i++){
			isPrime[i] = true;
		}
		
		//Check if every number greater than 2 is a prime number
		for(int j=2;j<=str;j++){
			if(isPrime[j-1]){
				System.out.println(j);
				
				//I am going to get rid of all the multiples of j
				for(int i=j*2;i<=str;i+=j){
					isPrime[j-1] = false;
				}
			}
		}
	}

}
