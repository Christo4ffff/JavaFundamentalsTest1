package Composition.Books;

import Composition.Creators.Author;

public class Book {

    private String name;
    private String author;
    private double price;
    private int qty = 0;

    public Book(String name, String author, int price, int qty) {
    }

//test toStrings
    Author FowsiaKoofi = new Author("Fowsia Koofi", "koofi.fawsia@pakistan.com", 'f') {
    };
    Book LTMC = new Book("Letters to my children", "Fowsia Koofi", 20,30);

//getters setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
