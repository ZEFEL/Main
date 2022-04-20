package Sample;

public class PoisonMatango extends Matango{
	int poisonCount = 5;
	
	// コンストラクタ
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void poisonAttack(Hero h) {
		super.attack(h);
		
		if(this.poisonCount !=  5) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damagePoint = h.hp / 5; 
			h.hp -= damagePoint;
			System.out.println(damagePoint + "ポイントのダメージ！");
			poisonCount --;
		}
	}

}
