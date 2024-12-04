package module3.task9;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book(String title, String author, int yearPublished, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = isAvailable;
    }
    //method returns false if book is anavailable to borrow
    public boolean borrowBook(){
        if(this!=null&&this.isAvailable==true){
            this.isAvailable = false;
            return true;
        }
        else return false;
    }

    public void returnBook(){
        if(this!=null){
            this.isAvailable = true;
        }
    }

    public String getBookInfo(){
        return String.format("Title: %s, Author: %s, Year Published: %d, Is Available: %b", title, author, yearPublished, isAvailable);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

}
