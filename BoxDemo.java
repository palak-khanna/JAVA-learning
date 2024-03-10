import java.util.*;

class Box{
	float width;
	float height;
	float depth;
}

class BoxDemo{

	public static void main(String args[]){
		Box mybox = new Box();

		Scanner s = new Scanner(System.in);

		System.out.println("Enter width : ");
		mybox.width = s.nextFloat();



		System.out.println("Enter height : ");
		mybox.height = s.nextFloat();


		System.out.println("Enter depth : ");
		mybox.depth = s.nextFloat();


		float vol = mybox.width * mybox.height * mybox.depth;

		System.out.println("The volume of the box = "+vol);
	}
}