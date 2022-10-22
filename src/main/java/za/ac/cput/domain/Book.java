package za.ac.cput.domain;
/*
* StudentNo:217068324
* Name: Cobain Liam Cupido
* Class Function: 
*/
public class Book {
    private String isbn;
    private String title;
    private String author;
    private String catagory;
    private String shelfNo;

    public Book() {
    }

    public Book(String isbn, String title, String author, String catagory, String shelfNo) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.catagory = catagory;
        this.shelfNo = shelfNo;
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

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getShelfNo() {
        return shelfNo;
    }

    public void setShelfNo(String shelfNo) {
        this.shelfNo = shelfNo;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", catagory=" + catagory + ", shelfNo=" + shelfNo + '}';
    }
    
}
