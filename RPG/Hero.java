package Sample;

public class Hero extends Character{
	
	// 属性定義
	private String name;	// 名前
	private int hp;	// HP
	static int money;
	Sword sword;
	
	// コンストラクタ
	public Hero(String name,int hp) {
		super(name,hp);
	}
	
	
	// 名前を得る
	public String getName() {
		return this.name;
	}
	
	// 名前を変える
	public String setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断。");
		}
		if(name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断");
		}
		if(name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断");
		}
		return this.name = name;
	}
	
	// hpを得る
	public int getHp() {
		return this.getHp();
	}
	
	// hpに値を代入
	public void setHp(int hp) {
		this.hp = hp;
	}
	//操作
	
	// 所持金をランダムに設定する
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
	}
	
	// さよなら
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	
	// 死亡
	private void die() {
		System.out.println("勇者は死んでしまった");
	}
	
	// 攻撃
	public void attack(Monster m) {
		System.out.println(this.name + "は攻撃した!");
		m.hp -= 10;
		System.out.println("敵に5ポイントのダメージを与えた！");
		
		System.out.println("お化けキノコから" + m.suffix + "から2ポイントのダメージを受けた");
	}
	
	// 眠る
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した!");
	}
	
	
	// 座る
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した！");
	}
	
	
	// 転がる
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	
	// 逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした。");
	}
	
	
	
}
