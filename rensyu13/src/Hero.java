public class Hero {
    private int hp;
    private String name;

    Hero() {
        this.setHp(200);
        this.setName("—EŽÒ");
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
}
