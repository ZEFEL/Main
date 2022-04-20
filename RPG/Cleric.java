package Sample;

import java.util.Random;

public class Cleric {
	// 属性定義
		String  name;
		int hp = 50;
		int mp = 10;
		static final int MAX_HP = 50;
		static final int MAX_MP = 10;
		
	// 操作定義
		public void selfAid() {
			this.mp -= 5;
			this.hp = MAX_HP;
		}
		public int pray(int sec) {
			Random rand = new Random();
			int recoverMP = rand.nextInt(3) + sec; 
			
			// 回復MPと最大MPを比較
			int actualRecoverMP = Math.min(MAX_MP - this.mp,recoverMP);
			
			System.out.println(this.name + "は、MPが" + actualRecoverMP + "回復した！");
			
			return actualRecoverMP;
		}
}
