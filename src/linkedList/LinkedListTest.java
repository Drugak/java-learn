package linkedList;

import java.util.*;


public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Anny");
        a.add("Roman");
        a.add("Kris");

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Gloria");
        b.add("Lall");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if (aIter.hasNext()) {
                aIter.next();
            }
            aIter.add(bIter.next());
            bIter.next();
        }
        System.out.println(a);


        bIter = b.iterator();
        while (bIter.hasNext()) {
            bIter.next();
            if (bIter.hasNext()) {
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);

        a.removeAll(b);

        System.out.println(a);
    }
}
