package rensyu11;

public class Book extends TangibleAsset{
    String isbn;

    // �R���X�g���N�^
    public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }

    // ���\�b�h
    public String getIsbn() { return this.isbn; }
}