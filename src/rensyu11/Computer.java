package rensyu11;

public class Computer extends TangibleAsset{
    String makerName;

    // �R���X�g���N�^
    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }

    // ���\�b�h
    public String getMakerName(){ return this.makerName; }
}
