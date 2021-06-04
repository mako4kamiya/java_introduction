public class Main {
	public static void main(String[] args) {
        // 武器生成
        Wepon we = new Wepon();
        // スーパーヒーローの生成
        SuperHero sh = new SuperHero("スーパーミナト");
        // 勇者の生成
        Hero h = new Hero("ミナト");
        // 剣の生成
        Sword s_honoo = new Sword("炎の剣", 10);
        h.sword = s_honoo;
        Sword s_densetsu = new Sword("伝説の剣", 100);
        sh.sword = s_densetsu;

        // 聖職者の生成
        Cleric c = new Cleric("アサカ");

        // 魔法使いの生成
        Wizard w = new Wizard("ハーマイオニー");

        // 泥棒の生成
        Thief t = new Thief("アサカ");
        
        // お化けキノコの生成
        Matango m1 = new Matango('A');
        m1.hp = 50;
        Matango m2 = new Matango('B');
        m2.hp = 48;
        
        // お化け毒キノコの生成
        PoisonMatango pm = new PoisonMatango('A');

        // 冒険の始まり
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println(" ヒーロー：" + sh.name + "(HP:" + sh.hp + " 装備：" + sh.sword.name + ")");
        System.out.println(" 勇者　　：" + h.name + "(HP:" + h.hp + " 装備：" + h.sword.name + ")");
        System.out.println(" 聖職者　：" + c.name + "(HP:" + c.hp + " MP:" + c.mp +")");
        System.out.println(" 魔法使い：" + w.name + "(HP:" + w.hp +")");
        System.out.println(" 泥棒　　：" + t.name + "(HP:" + t.hp + " MP:" + t.mp +")");
        System.out.println(" 敵　　　：" + "お化けキノコ" + m1.suffix + "(HP:" + m1.hp +")");
        System.out.println(" 敵　　　：" + "お化けキノコ" + m2.suffix + "(HP:" + m2.hp + ")");
        System.out.println(" 敵　　　：" + "お化け毒キノコ" + pm.suffix + "(HP:" + pm.hp + "MP:" + pm.mp + ")");
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