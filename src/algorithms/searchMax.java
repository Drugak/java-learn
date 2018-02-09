package algorithms;

import com.sun.istack.internal.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class searchMax {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("a");
        a.add("c");
        a.add("b");

        System.out.println(max(a));
    }

    public static <T extends Comparable> T max(@NotNull Collection<T> c) {
        if (c.isEmpty()) throw new NoSuchElementException();

        Iterator<T> iter = c.iterator();
        T largest = iter.next();
        while (iter.hasNext()) {
            T next = iter.next();
            if(largest.compareTo(next) < 0) largest = next;
        }
        return largest;
    }
}
