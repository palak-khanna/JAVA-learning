// average of an array values

class Average{
	public static void main(String args[]){
		double nums[] = {11.1,12.4,13.5,18.2,19.0};
		double result = 0;

		for(int i=0; i<5; i++){
			result = result + nums[i];};

		System.out.println("Average is : "+result/5);
	}
}