package Sample;

public class Wizard extends Character{
	private String name;
	private int hp;
	private int mp;
	private Wand wand;
	
	// コンストラクタ
	public Wizard(String name,int hp,int mp) {
		super(name,hp);
		this.mp = mp;
	}
	
	// ゲッターセッターメソッド
	
		// hpを得る
		public int getHp() {
			return this.hp;
		}
		
		// hpを変える
		public void setHp(int hp) {
			if(hp < 0) {
				this.hp = 0;
			}
			this.hp = hp;
		}
		
		// mpを得る
		public int getMp() {
			return this.mp;
		}
				
		// mpを変える
		public void setMp(int mp) {
			if(mp < 0) {
				this.mp = 0;
			}
			this.mp = mp;
		}
		
		// 名前を得る
		public String getName() {
			return this.name;
		}
				
		// 名前を変える
		public void setName(String name) {
			if(name == null || name.length() < 3) {
				throw new IllegalArgumentException("名前が以上です");
			}
			this.name = name;
		}
	
		// Wandクラスを得る
		public Wand getWand() {
			return this.wand;
		}
		
		// Wandクラスを変える
		public void setWand(Wand wand) {
			if(wand == null ) {
				throw new IllegalArgumentException("設定されようとしている杖がnullです。");
			}
			this.wand = wand;
		}
		
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に3ポイントのダメージ！");
		m.hp -= 3;
	}
	public void fireball(Monster m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ！");
		m.hp -= 20;
		this.mp -= 5;
	}
	public void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
	}
}
