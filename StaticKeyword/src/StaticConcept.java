class Enemy {
	private String name; // instance variables
	private boolean weapon;
	private int attack;
	//static: when class is loaded, static things also loaded at this time
	static int counter;
	
	Enemy(String name, boolean weapon, int attack)
	{
		this.name = name;
		this.weapon = weapon;
		this.attack = attack;
		counter++;
		System.out.println("Enemy Created "+counter);
	}
}

public class StaticConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//main(null); // recursive call
		
		for(int i = 1; i <= 10; i++)
		{
			Enemy obj = new Enemy("L"+i, true, i);
		}
	}
}
