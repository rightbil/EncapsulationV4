package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        System.out.print("Enter the Book Code: ");
        String code = keybd.nextLine();

        Book b = new Book();
        b.setCode(code);
        b.setAuthor("Dave W.");
        b.setPrice(59.99);
        b.setDescription("Java programming book");
        System.out.println(b.toString());

        Book testBookOne = new Book();
       // testBookOne.setCode("Book 8910");
      // testBookOne.setPrice(49.99);
       // testBookOne.setDescription("Python programming book");
        testBookOne.setAuthor("Dave W.");
        testBookOne.setPages(80);
        System.out.println(testBookOne.toString());


        Book testBookTwo = new Book();
        //testBookTwo.setCode("Book 8910");
        //testBookTwo.setPrice(49.99);
        //testBookTwo.setDescription("Python programming book");
        testBookTwo.setAuthor("Dave W.");
        testBookOne.setPages(80);
        System.out.println(testBookTwo.toString());

        Software s = new Software();
        s.setCode("Program1234");
        s.setDescription("Spreadsheet");
        s.setPrice(999.99);
        s.setOs("Windows");
        s.setProgrammer("Fi");
        System.out.println(s.toString());

        // testing

        System.out.println(testBookOne.equals(testBookTwo));



    }
}
