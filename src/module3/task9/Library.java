package module3.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        if(book!=null){
            books.add(book);
        }
    }

    public List<Book> searchBookByName(String title){
        return books.stream().filter(book -> book.getTitle().equals(title)).collect(Collectors.toList());
    }

    public void printAllBooksInfo(){
        for(Book book: books){
            System.out.println(book.getBookInfo());
        }
    }
}
