package module4.task5;

public class LRUElement implements Comparable<LRUElement>{
    private String value;
    private long timestamp;

    public LRUElement(String value, long timestamp){
        this.value = value;
        this.timestamp = timestamp;
    }
    @Override
    public int compareTo(LRUElement other){
        return Long.compare(timestamp, other.timestamp);
    }
    @Override
    public String toString(){

        return value;
    }
}
