
public class MainGame {
	
	int age = 30;
	String name = "Pooja";
	String defaultVal;
	
//	MainGame()
//	{
//		
//	}
	MainGame()
	{
		age = 10;
		name = "Devishi";
		System.out.println("Constructor Called");
	}
	
	MainGame(int inputAge,String inputName)
	{
		age = inputAge;
		name = inputName;
		System.out.println("Parameterized Constructor Called");
	}
	
	MainGame(double inputAge,String inputName)
	{
		age = (int)inputAge;
		name = inputName;
		System.out.println("Parameterized Constructor Called");
	}
	
	MainGame(String mydefaultValue, double inputAge,String inputName)
	{
		age = (int)inputAge;
		name = inputName;
		defaultVal = mydefaultValue;
		System.out.println("Parameterized Constructor Called");
	}
	
	int getAge()
	{
		return age;
	}
	String getName()
	{
		return name;
	}
	
	protected void finalize()
	{
		System.out.println("Finalized Called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainGame myMainGame = new MainGame();
		int mainGameAge = myMainGame.getAge();
		String mainGameName = myMainGame.getName();
		System.out.println("The age of my MainGame is = "+mainGameAge + " and Name is = " +mainGameName);
		
		
		MainGame myMainGame1 = new MainGame(20,"Palak");
		int mainGameAge1 = myMainGame1.getAge();
		String mainGameName1 = myMainGame1.getName();
		System.out.println("The age of my MainGame is = "+mainGameAge1 + " and Name is = " +mainGameName1);
		
		
	}

}