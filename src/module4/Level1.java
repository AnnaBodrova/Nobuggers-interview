package module4;

import java.util.*;

public class Level1 {
    //task 4
    public static boolean isSequenceCorrect(String input) {
        if (input.length() < 3) {
            return false;
        }
        char OPEN_ROUND = '(';
        char OPEN_SQUARE = '[';
        char OPEN_BRACE = '{';

        char CLOSE_ROUND = ')';
        char CLOSE_SQUARE = ']';
        char CLOSE_BRACE = '}';
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == OPEN_ROUND || input.charAt(i) == OPEN_SQUARE || input.charAt(i) == OPEN_BRACE) {
                stack.add(input.charAt(i));
            } else if (input.charAt(i) == CLOSE_ROUND) {
                if (stack.pop() == OPEN_ROUND) {
                    continue;
                } else
                    return false;
            } else if (input.charAt(i) == CLOSE_SQUARE) {
                if (stack.pop() == OPEN_SQUARE) {
                    continue;
                } else
                    return false;
            } else if (input.charAt(i) == CLOSE_BRACE) {
                if (stack.pop() == OPEN_BRACE) {
                    continue;
                } else
                    return false;
            } else
                throw new IllegalArgumentException("input string contains junk symbol");
        }
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    // level1 task5
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> list, int step) {
        if (step >= list.size()) {
            throw new IllegalArgumentException("step is more than array size");
        }
        if (step < 0) {
            throw new IllegalArgumentException("step cannot be negative");
        }
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.addAll(list);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < step; i++) {
            result.add(i, queue.pollLast());
        }
        for (int i = step; i < list.size(); i++) {
            result.add(i, queue.pollFirst());
        }
        return result;
    }

    // level1 task6
    public static int countOfUniqueNumbers(ArrayList<Integer> list) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.addAll(list);
        return uniqueNumbers.size();
    }

    // level1 task10
    public static void sort(ArrayList<Integer> list) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.addAll(list);
        list.clear();
        while (!queue.isEmpty()){
            list.add(queue.poll());
        }
    }
}
