// A simple recursion
import java.util.*;

class Factorial {
	// this is a recursive function
	
	int fact(int n){
		int result;
		
		if(n==1) return 1;
		result = fact(n-1)*n;
		return result;
		
	}
}

class Recursion{
	
	public static void main(String args[]){
		Factorial f = new Factorial();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int number = s.nextInt();
		
		System.out.println("The factorial of the number "+number+" is: "+f.fact(number));
		
	}
}