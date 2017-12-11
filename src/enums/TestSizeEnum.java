package enums;

import java.util.*;

public class TestSizeEnum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");

        String input = in.next().toUpperCase();

        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbrevition=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job--you paid attention to the _.");
        }
    }
}
