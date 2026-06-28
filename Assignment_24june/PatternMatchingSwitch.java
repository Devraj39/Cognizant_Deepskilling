/*
 * Name: Devraj Singh
 * Timestamp: 26-06-2026 03:27 PM
 */

public class PatternMatchingSwitch {

    static void checkType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println(i + " is an Integer");
            case String s -> System.out.println("\"" + s + "\" is a String");
            case Double d -> System.out.println(d + " is a Double");
            case Float f -> System.out.println(f + " is a Float");
            case Long l -> System.out.println(l + " is a Long");
            case null -> System.out.println("Object is null");
            default -> System.out.println("Unknown Type");
        }
    }

    public static void main(String[] args) {

        checkType(100);
        checkType("Hello");
        checkType(45.67);
        checkType(12.5f);
        checkType(123456789L);
        checkType(null);
    }
}