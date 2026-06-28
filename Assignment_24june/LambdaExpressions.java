/*
 * Name: Devraj Singh
 * Timestamp: 28-06-2026 04:09 PM
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Mango");

        Collections.sort(list, (a, b) -> a.compareTo(b));

        System.out.println("Sorted List:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}