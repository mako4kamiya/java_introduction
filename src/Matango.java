public class Matango {
    int hp;
    final int LEVEL = 10;
    char suffix;

    // �R���X�g���N�^
    public Matango(char suffix){
        this.suffix = suffix;
    }

    public void attack(Hero h) {
        System.out.println("�L�m�R" + this.suffix + "�̍U��");
        System.out.println("10�̃_���[�W");
        h.hp -= 10;
    }

    public void run() {
        System.out.println("�������L�m�R" + this.suffix + "�͓����o�����I");
        
    }
}
