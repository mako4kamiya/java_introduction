package main;
public class Cleric {
    String name;
    int hp;
    final int MAX_HP; // 定数は大文字
    int mp;
    final int MAX_MP; // 定数は大文字

    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた！");
        this.mp -= 5;
        this.hp += MAX_HP;
        System.out.println("HPが最大まで回復した");
    }

    public int pray(int sec) {
        System.out.println(this.name + sec + "秒間天に祈った！");
        int recover = sec + new java.util.Random().nextInt(3);
        int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
        this.mp += recoverActual;
        System.out.println("MPが" + recoverActual + "回復した");
        return recoverActual;
    }

    // コンストラクタ
    public Cleric(String name){
        this.name = name;
        this.hp = 50;
        this.MAX_HP = 50;
        this.mp = 10;
        this.MAX_MP = 10;    
    }
}
