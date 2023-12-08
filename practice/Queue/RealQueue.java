package practice.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class RealQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        System.out.println( q);
    }
}
