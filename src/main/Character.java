package main;
public abstract class Character {
    String name;
    int hp;

    // ������
    public void run(){
        System.out.println(this.name + "�͓����o����");
    }

    // �키
    public abstract void attack(Matango m);
}
