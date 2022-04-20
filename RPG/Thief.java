package Sample;

public class Thief extends Character{
	
	// 属性定義
	int mp;
	
	// コンストラクタ
	public Thief(String name,int hp,int mp) {
		super(name,hp);
		this.mp = mp;
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に200ポイントのダメージ！");
		m.hp -= 200;
	}

}
