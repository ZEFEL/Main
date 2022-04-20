package Sample;

public class SuperHero extends Hero{
	boolean  flying;
	
	// 攻撃
	public void attack(Matango m) {
		super.attack(m);
		if(this.flying) {
			super.attack(m);
		}
	}
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した。");
	}
	
	// 飛ぶ
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	// 着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
}
