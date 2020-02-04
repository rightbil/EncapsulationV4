package com.company;

import java.util.Objects;

public final class Book extends Product {
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
        //super();
        //this.author = "Bililign";
        //this.pages = 80;

    }

    @Override
    public String toString() {
        return "Author: " + author + "\n" +
                "Pages: " + pages + "\n" +
                "Price: "  + getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return getPages() == book.getPages() &&
                Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAuthor(), getPages());
    }
}

