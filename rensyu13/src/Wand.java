public class Wand {
    private String name;
    private double power;

    Wand() {
        this.setName("��{�I�ȏ�");
        this.setPower(1);
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

    public double getPower() {
        return this.power;
    }
    public void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("��ɐݒ肳��悤�Ƃ��Ă��閂�͂��ُ�ł�");
        }
        this.power = power;
    }
}
