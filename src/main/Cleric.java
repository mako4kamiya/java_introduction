package main;
public class Cleric {
    String name;
    int hp;
    final int MAX_HP; // �萔�͑啶��
    int mp;
    final int MAX_MP; // �萔�͑啶��

    public void selfAid() {
        System.out.println(this.name + "�̓Z���t�G�C�h���������I");
        this.mp -= 5;
        this.hp += MAX_HP;
        System.out.println("HP���ő�܂ŉ񕜂���");
    }

    public int pray(int sec) {
        System.out.println(this.name + sec + "�b�ԓV�ɋF�����I");
        int recover = sec + new java.util.Random().nextInt(3);
        int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
        this.mp += recoverActual;
        System.out.println("MP��" + recoverActual + "�񕜂���");
        return recoverActual;
    }

    // �R���X�g���N�^
    public Cleric(String name){
        this.name = name;
        this.hp = 50;
        this.MAX_HP = 50;
        this.mp = 10;
        this.MAX_MP = 10;    
    }
}
