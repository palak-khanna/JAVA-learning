import java.util.*;

class Box{
	float width;
	float height;
	float depth;
}

class BoxDemo2{

	public static void main(String args[]){
		Box mybox1 = new Box();
		Box mybox2 = new Box();

		Scanner s = new Scanner(System.in);

		System.out.println("Enter width of box 1: ");
		mybox1.width = s.nextFloat();

		System.out.println("Enter height of box 1: ");
		mybox1.height = s.nextFloat();

		System.out.println("Enter depth of box 1: ");
		mybox1.depth = s.nextFloat();
		
		System.out.println("Enter width of box 2: ");
		mybox2.width = s.nextFloat();

		System.out.println("Enter height of box 2: ");
		mybox2.height = s.nextFloat();

		System.out.println("Enter depth of box 2: ");
		mybox2.depth = s.nextFloat();


		float vol1 = mybox1.width * mybox1.height * mybox1.depth;
		float vol2 = mybox2.width * mybox2.height * mybox2.depth;

		System.out.println("The volume of the box1 = "+vol1);
		System.out.println("The volume of the box1 = "+vol2);

	}
}