public class Hero {
    String name;
    int hp;
    Sword sword;
    
    public void attack(Matango m){
        System.out.println(this.name + "�̍U���I");
        m.hp -= 5;
        System.out.println("5�|�C���g�̃_���[�W�����������I");
    }
    
    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "�́A�����ĉ񕜂����I");
    }
    
    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "�́A" + sec + "�b�������I");
        System.out.println("HP��" + sec + "�|�C���g�񕜂���");
    }
    
    public final void slip() {
        this.hp -= 5;
        System.out.println(this.name + "�́A�]�񂾁I");
        System.out.println("5�̃_���[�W�I");
    }
    
    public void run() {
        System.out.println(this.name + "�́A�����o�����I");
        // System.out.println("�������������������� GAMEOVER ��������������������");
    }

    // �R���X�g���N�^
    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }

    public Hero() {
        this("�_�~�[");
    }
}