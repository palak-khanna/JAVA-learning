class Test {

	int a ,b;
	
	Test(int i, int j)
	{
		a = i;
		b = j;
	}
	
	boolean equals(Test o)
	{
		if ((o.a == this.a) && (o.b == this.b))
			return true;
		else
			return false;
	}
}

class PassOB{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test ob1 = new Test(100,22);
		Test ob2 = new Test(100,22);
		Test ob3 = new Test(-1,-1);
		
		System.out.println("Ob1 == Ob2 " + ob1.equals(ob2)+ " ");
		
		System.out.println("Ob1 == Ob3 " + ob1.equals(ob3) + " ");
			
	}
}
