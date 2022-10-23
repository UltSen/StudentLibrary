/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.domain;

/**
 *
 * @author cobai
 */
public class Book {
   private String isbn;
   private String title;
   private String author;
   private String shelfNo;
   private boolean availableForLoan;

    public Book() {
    }

    public Book(String isbn, String title, String author, String shelfNo, boolean availableForLoan) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.shelfNo = shelfNo;
        this.availableForLoan = availableForLoan;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getShelfNo() {
        return shelfNo;
    }

    public void setShelfNo(String shelfNo) {
        this.shelfNo = shelfNo;
    }

    public boolean isAvailableForLoan() {
        return availableForLoan;
    }

    public void setAvailableForLoan(boolean availableForLoan) {
        this.availableForLoan = availableForLoan;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", shelfNo=" + shelfNo + ", availableForLoan=" + availableForLoan + '}';
    }
   
}
