package module4;

import java.util.ArrayList;

public class Node {
    private int value;
    private Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    @Override
    public String toString(){
        return "value is: " + this.value;
    }

    public static void reverseNodeList(Node node){
        Node prevoius = null;
        Node current = node;
        while(current!=null){
            Node next = current.getNext();
            current.setNext(prevoius);
            prevoius = current;
            current = next;
        }
    }



}
