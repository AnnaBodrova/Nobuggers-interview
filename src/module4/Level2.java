package module4;

import java.util.*;

public class Level2 {

    //task2
    public static Map<Integer,Integer> findNumbersCoupleForSum(List<Integer> list, Integer sum){
        Map<Integer,Integer> uniqueCouples = new HashMap<>();
        for (Integer i: list){
            if(list.contains(sum-i)){
                uniqueCouples.put(i, sum - i);
            }
        }
        return uniqueCouples;
    }
    //task3
    public static Set<Integer> getUniqueValues(Collection<Integer> collection){
        Set<Integer> uniqueValues = new HashSet<>(collection);
        return uniqueValues;
    }

    //task4
    public static char getFirstUniqueSymbolInText(String text){
        boolean isUnique = true;
        for (int i = 0; i < text.length(); i++){
            for(int j = i+1; j < text.length(); j++){
                if (text.charAt(i)==text.charAt(j)){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique == true){
                return text.charAt(i);
            }
            else {
                isUnique = true;
            }
        }
        throw new RuntimeException("No unique symbol");
    }

    //task1
    public static List<Integer> reverseCollection(Collection<Integer> collection){
        List<Integer> list = new ArrayList<>();
        list.addAll(collection);
        Integer tmp;
        for(int i= 0; i<list.size()/2; i++){
            tmp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, tmp);
        }
        return list;
        }
}
