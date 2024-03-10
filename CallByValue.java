class Test {
	
	int a , b;
	
	Test(int inputa, int inputb)
	{
		a = inputa;
		b = inputb;
	}
		
	void meth(int i,  int j)
	{
		i *= i;
		j /= j;
	}
	
	void meth(Test inputObject)
	{
		inputObject.a *= 2;
		inputObject.b /= 2;
	}
	
}

class CallByValue{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 50;
		int b = 100;
		
//		Test ob1 = new Test();

		Test objTest = new Test(a,b);
		
		System.out.println(" Value of a is = " + objTest.a + " and value of b = " + objTest.b);
		
//		ob1.meth(a,b);
	
		Test objTest2 = new Test(500,1000);
		
		objTest.meth(objTest2);
		
		
		System.out.println(" Value of a in Ob1 after changing is = " + objTest2.a + " and value of b = " + objTest2.b);
		
		//Test ob2 = new Test(100,22);
	}
}
