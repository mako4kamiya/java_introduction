public class Hero {
    int hp;
    String name;
    Sword sword;

    public void bye() {
        System.out.println("�E�҂͕ʂ��������");
    }
    public void die() {
        System.out.println(this.name + "�͎���ł��܂����I");
        System.out.println("GAME OVER�ł��B");
    }
    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "�͖����ĉ񕜂����I");
    }
    public void attack(Matango m) {
        System.out.println("�������L�m�R" + m.suffix + "����2�|�C���g�̔������󂯂�" );
        this.hp -= 2;
        if (this.hp <= 0 ){
            this.die();
        }
    }
}
