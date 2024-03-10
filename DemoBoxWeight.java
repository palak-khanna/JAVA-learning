// MORE PRACTICAL EXAMPLE FOR INHERITANCE 

class Box{
	protected double width;
	double height;
	double depth;
	
	// constructor of 1 type
	Box(Box ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
		System.out.println("This is Box custom constructor with 1 obj type parameters. ");
	}
	
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
		System.out.println("This is Box custom constructor with 3 parameters. ");
	}
	
	Box(double len){
		width = height = depth = len;
		System.out.println("This is Box custom constructor with 1 parameter. cube. ");
	}
	
	Box(){
		width = -1;
		height = -1;
		depth = -1;
		System.out.println("This is Box default constructor");
	}
	
	double vol(){
		double volume = width*depth*height;
		return volume;
	}
}

class BoxWeight extends Box{
	double weight;
	
	BoxWeight(double w, double h, double d, double m){
		width = w;
		height = h;
		depth = d;
		weight = m;
		System.out.println("This is BoxWeight custom constructor with 4 parameters. ");
	}
	BoxWeight(double w, double h, double d){
		
		width = w;
		height = h;
		depth = d;
		System.out.println("This is BoxWeight custom constructor with 3 parameters. ");
	}
	
	BoxWeight()
	{
		width = -2.0;
		System.out.println("This is BoxWeight default constructor");
	}
}

class DemoBoxWeight{
	public static void main(String args[]){
		double k = 567.890, w = 6, h = 8, d = 10, m = 9;
		
		Box obj = new Box();
		Box obj1 = new Box(k);
		Box obj2 = new Box(w,h,d);
		BoxWeight obj3 = new BoxWeight(w,h,d);
		BoxWeight obj4 = new BoxWeight(w,h,d,m);
		Box obj5 = new Box(obj2);
		
		System.out.println("Volume of obj : "+obj.vol());
		System.out.println("Volume of obj1 : "+obj1.vol());
		System.out.println("Volume of obj2 : "+obj2.vol());
		System.out.println("Volume of obj3 : "+obj3.vol());
		System.out.println("Volume of obj4 : "+obj4.vol());
	}
}

/*All other parameterized constructor cannot be accessed directly by the subclass BoxWeight
because it has its own constructor present. but we can use it when its declared super explicitely.

if in main we call the following, will generate an error:-

BoxWeight object = new Box() # any number parameter present in the Box class.
Reason :- Box type cannot be converted to BoxWeight

if we dont spc anything default constructor of super called.*/