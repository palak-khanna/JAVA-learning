
class Test{
	int a; //dafault public
	public int b;
	private int c;// private access spc
	
	// methods to access c
	
	void setc(int i){
		// set c's value
		c = i;
	}
	
	int getc(){
		// getting c value
		return c;
	}
}

class AccessTest{
	public static void main(String args[]){
		Test obj = new Test();
		
		obj.a = 45;
		obj.b = 5;
		
		// obj.c = 90
		// error as access is private
		
		obj.setc(50);
		// some value given to c but still cant access like obj.c....
		
		System.out.println("The value of a "+obj.a+" ,The value of b "+obj.b+ " ,The value of c "+obj.getc());
	}
}