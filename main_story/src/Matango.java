public class Matango {
    int hp = 50;
	char suffix;
	
	public Matango(char suffix){
		this.suffix = suffix;
	}

	public void attack(Hero h){
		System.out.println("�L�m�R" + this.suffix + "�̍U��");
		System.out.println("10�̃_���[�W");
		h.hp -= 10;	
	}

}
