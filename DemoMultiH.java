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

class shipment extends BoxWeight{
	double cost;
	
	shipment(shipment ob){
		super(ob);
		cost = ob.cost;
	}
	
	shipment(double w, double h, double d, double m, double c){
		super(w,h,d,m);
		cost = c;
	}
	
	shipment(double len, double m, double c){
		super(len,m);
		cost = c;
	}
	
	shipment(){
		super();
		cost = -1;
	}
}

class DemoMultiH{
	public static void main(String args[]){
		shipment s = new shipment(2.567, 2.67678, 3.4675657, 5, 90);
		shipment shipment1 = new shipment();
		shipment shipment2 = new shipment(5.6, 7.9076, 3.789, 2.123, 9);
		shipment shipment3 = new shipment(8.906, 12, 200);
		shipment shipment4 = new shipment(s);
		
		double vol1 = shipment1.Volume();
		System.out.println("Volume of the Box1: "+vol1);
		System.out.println("The Weight of the box: "+shipment1.weight);
		System.out.println("The cost of shipment: "+shipment1.cost);
		System.out.println();
		
		double vol2 = shipment2.Volume();
		System.out.println("Volume of the Box2: "+vol2);
		System.out.println("The Weight of the box: "+shipment2.weight);
		System.out.println("The cost of shipment: "+shipment2.cost);
		System.out.println();
		
		double vol3 = shipment3.Volume();
		System.out.println("Volume of the Box3: "+vol3);
		System.out.println("The Weight of the box: "+shipment3.weight);
		System.out.println("The cost of shipment: "+shipment3.cost);
		System.out.println();
		
		double vol4 = shipment4.Volume();
		System.out.println("Volume of the Box4: "+vol4);
		System.out.println("The Weight of the box: "+shipment4.weight);
		System.out.println("The cost of shipment: "+shipment4.cost);
		System.out.println();
	}
}