package com.company;

public class Book extends Product {

    private String author;
    private int pages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    public Book() {
        super();
        this.author = "Bililign";
        this.pages = 80;

    }

    @Override
    public String toString() {
        return "Author: " + author + "\n" +
                "Pages: " + pages + "\n" +
                "Price: "  + getPrice();
    }
}

