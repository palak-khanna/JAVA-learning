
// INHERITANCE BASICS 
/* to inherit a class we incorporate the defination of one class into another by using extends keyword.*/

class A {
	int i, j;
	
	void showij(){
		System.out.println("i and j: "+i+" "+j);
	}
}

class B extends A {
	int k;
	void showk(){
		System.out.println("k: "+k);
	}
	
	void sum(){
		System.out.println("i+j+k: "+ (i+j+k));
	}
}

class SimpleInheritance{
	public static void main(String args[]){
		A superob = new A();
		B subob = new B();
		
		// the super class may be used by itself 
		superob.i = 7;
		superob.j = 8;
		System.out.println("Contents of superob: ");
		superob.showij();
		System.out.println();
		
		subob.i = 10;
		subob.j = 20;
		subob.k = 30;
		System.out.println("Contents of subob: ");
		subob.showij();
		subob.showk();
		System.out.println();
		
		System.out.println("Sum of i, j, k: ");
		subob.sum();
	}
}