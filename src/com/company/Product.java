package com.company;
import java.lang.*;
import java.util.Objects;

public abstract class Product {

    private String code;
    private String description;
    private double price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
        System.out.printf("I am called...");
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code: " + code + "\n" +
                "Description: " + description + "\n" +
                "Price: " + this.getFormattedPrice(price) + "\n";
    }
// focus of this assignment is to override the

    @Override
    public boolean equals(Object o) {
        // null check
        if(o==null){return  false;}
        //instance check
        if(o==this) {return true;};

        if(!(o instanceof Product)){ return false;}
//
//        if ((o instanceof Product) && (((Product) o).getValue() == this.value)) {
//            return true;
//        } else {
//            return false;
//        }
        // condition 3
        Product p =  (Product) o;
        return p.code.equals(code) &&
                p.description.equals(description) &&
                p.price==price;
    }
    @Override
    public int hashCode() {
        //TODO: overriding the equal method needs revision

        int result= 17;
        result=  31 * result+ code.hashCode();
        result = 31 * result+ description.hashCode();
        result=  31 * result + (int)price;
        return result; // old ways

       // return  Objects.hash(code,description,price);
    }

    private String getFormattedPrice(double price) {
        // Use the NumberFormat class to format the price to 2 decimal places
        return "$%.2f";
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}
