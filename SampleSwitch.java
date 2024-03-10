// switch case
import java.util.*;

class SampleSwitch{

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = s.nextInt();

		switch(a){
			case 0:
				System.out.println("the number is zero.");
				break;
			case 1:
				System.out.println("the number is one.");
				break;			
			case -1:
				System.out.println("the number is negative one.");
				break;
			default:
				System.out.println("the number is less than negative one or grater than one.");
				break;
		}
	}
}