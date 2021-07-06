public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    Wizard() {
        this.setHp(100);
        this.setHp(100);
        this.setName("���@�g��");
        this.wand = new Wand();
    }
    
    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int)(basePoint * this.getWand().getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(this.getName() + "��" + this.getWand().getName()+ "���g�����B");
        System.out.println(this.getName() + "��" + h.getName() + "��hp��" + recovPoint + "�񕜂����I");
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }
    
    public int getMp() {
        return this.mp;
    }
    
    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException
            ("�ݒ肳��悤�Ƃ��Ă���mp���ُ�ł��B");
        }
        this.mp = mp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException
            ("���O��3�����ȏ�ł���K�v������܂��B�����𒆒f���܂��B");
        }
        this.name = name;
    }
    
    public Wand getWand() {
        return this.wand;
    }
    
    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException
            ("�ݒ肳��悤�Ƃ��Ă����null�ł��B");
        }
        this.wand = wand;
    }

}