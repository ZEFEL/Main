package Sample;

public class Wand {
	private String name;
	private double power;
	
	// カプセル化メソッド
	
	// 杖の名前を得る
	public String getName() {
		return this.name;
	}
	
	// 杖の名前を帰る
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が以上です");
		}
		
		this.name = name;
	}
	// 杖の威力を得る
	public double getPower() {
		return this.power;
	}
	
	// 杖の威力を変える
	public void setPower(double power) {
		if(power >= 0.5 && power <= 100) {
			this.power = power;
		}
		throw new IllegalArgumentException("威力が異常値です");
	}

}
