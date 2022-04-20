package Sample;

public class Slime extends WalkingMonster{
	final int LEVEL = 10;
	
	
	// コンストラクタ
	public Slime(int hp,int mp,char suffix) {
		super(hp,mp,suffix);	
	}
	
	public void attack(Character c) {
		System.out.println("スライム" + this.suffix + "の攻撃！");
		System.out.println("2のダメージ！");
		c.hp -= 2;
	}
	
	public void run() {
		System.out.println("スライム" + this.suffix + "は、体をうねらせて逃げ出した。");
	}
}
