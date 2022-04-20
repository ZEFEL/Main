package Sample;

public class Main {

	public static void main(String[] args) {
		
		// 装備をインスタンス化
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		
		// パーティメンバーをインスタンス化
		Hero h1= new Hero("ミナト",100);
		Hero h2 = new Hero("アサカ",100);
		Thief t = new Thief("ラブタ",100,200);
		Wizard w1 = new Wizard("オダワラ",100,50);
		Wizard w2 = new Wizard("オオハラメン",100,50);
		 
		h1.setName("");
		// 属性を初期化
		// c.sword = s;
		// System.out.println("現在の武器は" + c.sword.name);
				
		
		// モンスターをインスタンス化
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime(40,10,'A');
		monsters[1] = new Goblin(50,10,'A');
		monsters[2] = new DeathBat(30,100,'A');
		// 各コマンド

	}

}
