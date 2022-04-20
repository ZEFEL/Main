package Sample;

public class Matango extends WalkingMonster{
	// 属性定義				
	final int LEVEL = 10;		// 初期レベル
	char suffix;
	
	// コンストラクタ
	public Matango(int hp,int mp,char suffix) {
		super(hp,mp);
		this.suffix = suffix;
	}
	// 操作定義
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した!");
	}

	public void attack(Character c) {
		System.out.println("キノコ" + this.suffix + "の攻撃！");
		System.out.println("10のダメージ！");
		c.hp -= 10;
	}
}
