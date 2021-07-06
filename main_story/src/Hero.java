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
        this("�E��");
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
        System.out.println("�E�҂͕ʂ��������");
    }

    private void die() {
        System.out.println(this.getName() + "�͎���ł��܂����I");
        System.out.println("GAME OVER�ł��B");
    }

    public void sleep() {
        this.setHp(100);
        System.out.println(this.getName() + "�͖����ĉ񕜂����I");
    }

    public void attack(Matango m) {
        System.out.println("�������L�m�R" + m.getSuffix() + "����2�|�C���g�̔������󂯂�" );
        this.setHp(this.getHp() - 2);
        if (this.getHp() <= 0 ){
            this.die();
        }
    }
}
