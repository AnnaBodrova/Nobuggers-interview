import module4.Node;
import module4.task5.LRU;
import module4.task5.LRUElement;
import module4.task6.PhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static module4.Level1.*;
import static module4.Level2.*;
import static module4.Node.reverseNodeList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        // task9
//        Book book = new Book("War and Peace", "Lev Tolstoy", 1858, true);
//        Book book2 = new Book("Anna Karenina", "Lev Tolstoy", 1876, true);
//        Library library = new Library();
//        library.addBook(book);
//        library.addBook(book2);
//        System.out.println(library.searchBookByName("War and Peace").get(0).getBookInfo());
//        library.printAllBooksInfo();
//
//        // task5
//        Student student1 = new Student("Ivan Ivanov", "u123", 4.01);
//        Student student2 = student1.clone();
//        System.out.println(student2.equals(student1));
//
//        // task10
//        Admin admin  = new Admin("000", "Admin1", "admin@test.io");
//        Customer customer  = new Customer("001", "Customer1", "customer@test.io");
//        Electronics electronics = new Electronics("phone", 200, "0001");
//        Clothing clothing = new Clothing("skirt", 100, "0002");
//        customer.addProduct(electronics);
//        customer.addProduct(clothing);
//        Order order = new Order("001",customer);
//        System.out.println(order.countTotalSum());
//        DatabaseOperations databaseOperations = new DatabaseOperations();
//        databaseOperations.saveOrder(order);
//        databaseOperations.getOrder("001");
//
//        //task8
//        SavingsAccount savingsAccount = new SavingsAccount("11", 566.9);
//        CheckingsAccount checkingsAccount = new CheckingsAccount("22", 110.9);
//        List<BankAccount> bankAccounts = new ArrayList<>();
//        bankAccounts.add(savingsAccount);
//        bankAccounts.add(checkingsAccount);
//        System.out.println(bankAccounts.get(0).calculateInterest());
//        System.out.println(bankAccounts.get(1).calculateInterest());

        List<Integer> list = new ArrayList<>(List.of());
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(0);
        list.add(8);
        list.add(8);

        Map <Integer, Integer> result = findNumbersCoupleForSum(list, 6);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()){
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }

        Set<Integer> uniqueValues = getUniqueValues(list);
        System.out.println(uniqueValues);

        System.out.println(getFirstUniqueSymbolInText("abcba"));

        //task1
        System.out.println(reverseCollection(new ArrayList<>(List.of(4,7,8,0, 6))));

        //task5
        LRU lru = new LRU(3);
        lru.putValueToCache(new LRUElement("q", 20));
        lru.putValueToCache(new LRUElement("w", 13));
        lru.putValueToCache(new LRUElement("e", 14));
        lru.putValueToCache(new LRUElement("i", 6));
        lru.printLRU();

        // level2 task6
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan Ivanov", 726345);
        phoneBook.add("Petr Ivanov", 726333);
        phoneBook.add("Egor Ivanov", 726885);

        System.out.println(phoneBook.search("Petr Ivanov"));

        // leve1 task4
        System.out.println(isSequenceCorrect("([]{})"));

        // leve1 task5
        ArrayList<Integer> list1 = rotateArray(new ArrayList<>(List.of(1,2,3,4,5)),0);

        for (Integer i: list1){
            System.out.println(i);
        }
        // leve1 task6
        System.out.println(countOfUniqueNumbers(new ArrayList<>(List.of(1,2,3,4,5,5,1,7))));

        // leve1 task10
        System.out.println("task10");
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1,2,3,4,5,2,-8));
        sort(list2);
        for (Integer i: list2){
            System.out.println(i);
        }

        // reverse node list
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, node1);
        Node node3 = new Node(3, node2);

        reverseNodeList(node3);


    }


}