public class PoisonMatango extends Matango {
    int mp = 5;
    public void poisonAttack(Hero h) {
        System.out.println("お化け毒キノコ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        h.hp -= 10;
    }

    public void attack(Hero h) {
        super.attack(h);
        if (this.mp > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int dmg = h.hp / 5;
            h.hp -= dmg;
            System.out.println(dmg + "のダメージ");
            this.mp--;
        }
    }

    // コンストラクタ
    public PoisonMatango(char suffix){
        super(suffix);
    }
}
