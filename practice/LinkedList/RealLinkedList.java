package practice.LinkedList;

import java.util.LinkedList;

public class RealLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(3);
        ls.add(5);
        ls.addFirst(6);
        ls.addLast(2);
        System.out.println(ls);
        int l=ls.get(3);
        ls.removeLast();
        ls.push(3);
        ls.pop();
        ls.poll();
        ls.peek();
        System.out.println(l);
        System.out.println(ls);

    }
}
