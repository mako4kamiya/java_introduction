public class Wand {
    private String name;
    private double power;

    Wand() {
        this.setName("基本的な杖");
        this.setPower(1);
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

    public double getPower() {
        return this.power;
    }
    public void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("杖に設定されようとしている魔力が異常です");
        }
        this.power = power;
    }
}
