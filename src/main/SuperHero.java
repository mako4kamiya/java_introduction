package main;
public class SuperHero extends Hero {
    boolean flying;

    public void fly() {
        this.flying = true;
        System.out.println(this.name + "は、飛び上がった！");
    }

    public void land() {
        this.flying = false;
        System.out.println(this.name + "は、着地した！");
    }

    public void attack(Matango m) {
        super.attack(m);
        if (this.flying) {
            super.attack(m);
        }
    }

    public void run() {
        System.out.println(this.name + "は、撤退した！");
        System.out.println("■■■■■■■■■■ GAMEOVER ■■■■■■■■■■");
    }

    // コンストラクタ
    public SuperHero(String name) {
        super(name);
    }
}