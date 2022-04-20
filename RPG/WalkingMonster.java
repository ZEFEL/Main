package Sample;

public abstract class WalkingMonster extends Monster{
	// コンストラクタ
	public WalkingMonster(int hp,int mp, char suffix) {
		super(hp,mp,suffix);
	}
	
	public abstract void attack(Character c);
	public void run() {
		System.out.println("トコトコ走って逃げる");
	}
	
}
