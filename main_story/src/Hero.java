public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    Hero(String name) {
        this.setHp(200);
        this.setName(name);
        this.sword = new Sword();
    }
    Hero() {
        this("勇者");
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void bye() {
        System.out.println("勇者は別れを告げた");
    }

    private void die() {
        System.out.println(this.getName() + "は死んでしまった！");
        System.out.println("GAME OVERです。");
    }

    public void sleep() {
        this.setHp(100);
        System.out.println(this.getName() + "は眠って回復した！");
    }

    public void attack(Matango m) {
        System.out.println("お化けキノコ" + m.getSuffix() + "から2ポイントの反撃を受けた" );
        this.setHp(this.getHp() - 2);
        if (this.getHp() <= 0 ){
            this.die();
        }
    }
}
