package module4.task5;

import java.util.PriorityQueue;

public class LRU {
    private static  int size;

    public LRU(int size){
        this.size = size;
    }
    private PriorityQueue<LRUElement> queue = new PriorityQueue<LRUElement>();
    public void putValueToCache(LRUElement value){
        if (queue.size()<size)
            queue.add(value);
        else{
            queue.remove();
            queue.add(value);
        }
    }

    public void printLRU(){
        while (queue.size() != 0)
            System.out.println(queue.remove());
    }
}
