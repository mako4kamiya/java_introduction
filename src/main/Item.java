package main;
public class Item {
    String name;
    int price;

    // �R���X�g���N�^
    public Item(String name) {
        this.name = name;
        this.price = 0;
    }
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
