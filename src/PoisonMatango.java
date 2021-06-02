public class PoisonMatango extends Matango {
    int mp = 5;
    public void poisonAttack(Hero h) {
        System.out.println("�������ŃL�m�R" + this.suffix + "�̍U��");
        System.out.println("10�̃_���[�W");
        h.hp -= 10;
    }

    public void attack(Hero h) {
        super.attack(h);
        if (this.mp > 0) {
            System.out.println("����ɓł̖E�q���΂�܂����I");
            int dmg = h.hp / 5;
            h.hp -= dmg;
            System.out.println(dmg + "�̃_���[�W");
            this.mp--;
        }
    }

    // �R���X�g���N�^
    public PoisonMatango(char suffix){
        super(suffix);
    }
}
