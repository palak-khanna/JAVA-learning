class Box{
	private double width;
	private double height;
	private double depth;
	
	Box(Box ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	Box(double len){
		width = height = depth = len;
	}
	
	Box(){
		width = -1;
		depth = -1;
		height = -1;
	}
	
	double Volume(){
		return width*depth*height;
	}
}

class BoxWeight extends Box{
	double weight;
	
	BoxWeight(BoxWeight ob){
		super(ob);
		weight = ob.weight;
	}
	
	BoxWeight(double w, double h, double d, double m){
		super(w,h,d);
		weight = m;
	}
	
	BoxWeight(){
		super();
		weight = -1;
	}
	
	BoxWeight(double l, double m){
		super(l);
		weight = m;
	}
}

class DemoSuper{
	public static void main(String args[]){
		BoxWeight myBox1 = new BoxWeight(12, 6.56, 8, 20);
		BoxWeight myBox2 = new BoxWeight(5.906778, 9.494, 3.23093, 6);
		BoxWeight mycube = new BoxWeight(6, 9);
		BoxWeight myBox4 = new BoxWeight(myBox1);
		BoxWeight myBox5 = new BoxWeight();
		
		double vol1 = myBox1.Volume();
		System.out.println("Volume of the Box1: "+vol1);
		System.out.println();
		
		double vol2 = myBox2.Volume();
		System.out.println("Volume of the Box2: "+vol2);
		System.out.println();
		
		double vol3 = mycube.Volume();
		System.out.println("Volume of the Box3: "+vol3);
		System.out.println();
		
		double vol4 = myBox4.Volume();
		System.out.println("Volume of the Box4: "+vol4);
		System.out.println();
		
		double vol5 = myBox5.Volume();
		System.out.println("Volume of the Box5: "+vol5);
		System.out.println();
	}
}