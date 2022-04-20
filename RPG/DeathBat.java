package Sample;

public class DeathBat extends WalkingMonster{
	final int LEVEL = 10;
	char suffix;
	
	// コンストラクタ
	public DeathBat(int hp,int mp,char suffix) {
		super(hp,mp,suffix);
	}
	
	public void attack(Character c) {
		System.out.println("地獄コウモリ" + this.suffix + "の攻撃！");
		System.out.println("15のダメージ！");
		c.hp -= 15;
	}
	
	public void run() {
		System.out.println("地獄コウモリ" + this.suffix + "は、羽ばたいて逃げ出した。");
	}

}
