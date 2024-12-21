package module4.task6;

import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, Integer> phoneBook;

    public PhoneBook(){
        phoneBook = new HashMap();
    }

    public void add(String name, Integer number){
        phoneBook.put(name,number);
    }

    public Integer search(String name){
        if(phoneBook.containsKey(name)){
            return phoneBook.get(name);
        }
        else throw new IllegalArgumentException("No such person in the book");
    }

    public void delete(String name){
        phoneBook.remove(name);
    }

}
