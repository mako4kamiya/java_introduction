public class Main {
	public static void main(String[] args) {
        // ���퐶��
        Wepon we = new Wepon();
        // �X�[�p�[�q�[���[�̐���
        SuperHero sh = new SuperHero("�X�[�p�[�~�i�g");
        // �E�҂̐���
        Hero h = new Hero("�~�i�g");
        // ���̐���
        Sword s_honoo = new Sword("���̌�", 10);
        h.sword = s_honoo;
        Sword s_densetsu = new Sword("�`���̌�", 100);
        sh.sword = s_densetsu;

        // ���E�҂̐���
        Cleric c = new Cleric("�A�T�J");

        // ���@�g���̐���
        Wizard w = new Wizard("�n�[�}�C�I�j�[");

        // �D�_�̐���
        Thief t = new Thief("�A�T�J");
        
        // �������L�m�R�̐���
        Matango m1 = new Matango('A');
        m1.hp = 50;
        Matango m2 = new Matango('B');
        m2.hp = 48;
        
        // �������ŃL�m�R�̐���
        PoisonMatango pm = new PoisonMatango('A');

        // �`���̎n�܂�
        System.out.println("������������������������������������������������������������");
        System.out.println(" �q�[���[�F" + sh.name + "(HP:" + sh.hp + " �����F" + sh.sword.name + ")");
        System.out.println(" �E�ҁ@�@�F" + h.name + "(HP:" + h.hp + " �����F" + h.sword.name + ")");
        System.out.println(" ���E�ҁ@�F" + c.name + "(HP:" + c.hp + " MP:" + c.mp +")");
        System.out.println(" ���@�g���F" + w.name + "(HP:" + w.hp +")");
        System.out.println(" �D�_�@�@�F" + t.name + "(HP:" + t.hp + " MP:" + t.mp +")");
        System.out.println(" �G�@�@�@�F" + "�������L�m�R" + m1.suffix + "(HP:" + m1.hp +")");
        System.out.println(" �G�@�@�@�F" + "�������L�m�R" + m2.suffix + "(HP:" + m2.hp + ")");
        System.out.println(" �G�@�@�@�F" + "�������ŃL�m�R" + pm.suffix + "(HP:" + pm.hp + "MP:" + pm.mp + ")");
        System.out.println("------------------------------");
        // h.sit(5);
        // c.selfAid();
        // c.pray(3);
        // w.heal(h);
        // m1.run();
        // m2.run();
        // h.run();
        // sh.fly();
        // sh.land();
        // sh.attack(m1);
        // sh.run();
        pm.attack(h);
        pm.poisonAttack(h);
	}
}