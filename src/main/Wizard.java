package main;
public class Wizard {
    String name;
    int hp;
    public void heal(Hero h) {
        h.hp += 10;
        System.out.println(this.name + "�̓q�[�����������I");
        System.out.println(h.name + "��HP��10�񕜂����I");
    }

    // �R���X�g���N�^
    public Wizard(String name) {
        this.name = name;
        this.hp = 50;
    }
}
