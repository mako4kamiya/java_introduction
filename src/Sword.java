public class Sword {
    String name;
    int damage;

    // コンストラクタ
    public Sword(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public Sword() {
        this("木の剣", 5);
    }
}
