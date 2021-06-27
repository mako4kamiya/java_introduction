package main;
public class SuperHero extends Hero {
    boolean flying;

    public void fly() {
        this.flying = true;
        System.out.println(this.name + "�́A��яオ�����I");
    }

    public void land() {
        this.flying = false;
        System.out.println(this.name + "�́A���n�����I");
    }

    public void attack(Matango m) {
        super.attack(m);
        if (this.flying) {
            super.attack(m);
        }
    }

    public void run() {
        System.out.println(this.name + "�́A�P�ނ����I");
        System.out.println("�������������������� GAMEOVER ��������������������");
    }

    // �R���X�g���N�^
    public SuperHero(String name) {
        super(name);
    }
}