public class Matango {
    private int hp;
	private char suffix;

	Matango() {
		this.setHp(50);
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public char getSuffix() {
		return this.suffix;
	}

	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}

	public void attack(Hero h){
		System.out.println("�L�m�R" + this.getSuffix() + "�̍U��");
		System.out.println("10�̃_���[�W");
		h.setHp(h.getHp() - 10);	
	}

}
