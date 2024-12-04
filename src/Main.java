import module3.task10.*;
import module3.task5.Student;
import module3.task8.BankAccount;
import module3.task8.CheckingsAccount;
import module3.task8.SavingsAccount;
import module3.task9.Book;
import module3.task9.Library;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // task9
        Book book = new Book("War and Peace", "Lev Tolstoy", 1858, true);
        Book book2 = new Book("Anna Karenina", "Lev Tolstoy", 1876, true);
        Library library = new Library();
        library.addBook(book);
        library.addBook(book2);
        System.out.println(library.searchBookByName("War and Peace").get(0).getBookInfo());
        library.printAllBooksInfo();

        // task5
        Student student1 = new Student("Ivan Ivanov", "u123", 4.01);
        Student student2 = student1.clone();
        System.out.println(student2.equals(student1));

        // task10
        Admin admin  = new Admin("000", "Admin1", "admin@test.io");
        Customer customer  = new Customer("001", "Customer1", "customer@test.io");
        Electronics electronics = new Electronics("phone", 200, "0001");
        Clothing clothing = new Clothing("skirt", 100, "0002");
        customer.addProduct(electronics);
        customer.addProduct(clothing);
        Order order = new Order("001",customer);
        System.out.println(order.countTotalSum());
        DatabaseOperations databaseOperations = new DatabaseOperations();
        databaseOperations.saveOrder(order);
        databaseOperations.getOrder("001");

        //task8
        SavingsAccount savingsAccount = new SavingsAccount("11", 566.9);
        CheckingsAccount checkingsAccount = new CheckingsAccount("22", 110.9);
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(savingsAccount);
        bankAccounts.add(checkingsAccount);
        System.out.println(bankAccounts.get(0).calculateInterest());
        System.out.println(bankAccounts.get(1).calculateInterest());

    }
}