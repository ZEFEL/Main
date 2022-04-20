package Sample;

public abstract class Character {
	String name;
	int hp;
	
	// コンストラクタ
	public Character(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	
	// 戦う
	public abstract void attack(Monster m);
		// System.out.println(this.name + "の攻撃！");
		// m.hp -=
		// System.out.println("敵に" + "ポイントのダメージを与えた！");
	
}
