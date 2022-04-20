package Sample;

public class Goblin extends WalkingMonster{
	final int LEVEL = 10;
	
	// コンストラクタ
	public Goblin(int hp,int mp,char suffix) {
		super(hp,mp,suffix);
		
	}
	
	public void attack(Character c) {
		System.out.println("ゴブリン" + this.suffix + "の攻撃！");
		System.out.println("10のダメージ！");
		c.hp -= 10;
	}
	
	public void run() {
		System.out.println("ゴブリン" + this.suffix + "は、腕を振って逃げ出した。");
	}
}
