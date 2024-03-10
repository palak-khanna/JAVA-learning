import java.lang.*;
import java.util.*;

class welcomeStringInputEg
{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("May I know your name?");
		String name = s.nextLine();
		System.out.println("Welcome Mr/Mrs "+name);
	}
}
