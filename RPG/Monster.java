package Sample;

public abstract class Monster {
	int hp;
	int mp;
	int suffix;
	
	public Monster(int hp,int mp,int suffix) {
		this.hp = hp;
		this.mp = mp;
		this.suffix = suffix;
	}
	
	public abstract void attack(Character h);
	public abstract void run();
	
	
}
