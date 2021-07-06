public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    Wizard() {
        this.setHp(100);
        this.setHp(100);
        this.setName("魔法使い");
        this.wand = new Wand();
    }
    
    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int)(basePoint * this.getWand().getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(this.getName() + "は" + this.getWand().getName()+ "を使った。");
        System.out.println(this.getName() + "は" + h.getName() + "のhpを" + recovPoint + "回復した！");
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
            ("設定されようとしているmpが異常です。");
        }
        this.mp = mp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException
            ("名前は3文字以上である必要があります。処理を中断します。");
        }
        this.name = name;
    }
    
    public Wand getWand() {
        return this.wand;
    }
    
    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException
            ("設定されようとしている杖がnullです。");
        }
        this.wand = wand;
    }

}