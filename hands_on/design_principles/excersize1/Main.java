public class Main {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Loading user data.");

        Logger logger3 = Logger.getInstance();
        logger3.log("Application closed.");

        // Verify that all references point to the same object
        System.out.println();

        System.out.println("logger1 HashCode: " + logger1.hashCode());
        System.out.println("logger2 HashCode: " + logger2.hashCode());
        System.out.println("logger3 HashCode: " + logger3.hashCode());

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("\nOnly one Logger instance exists.");
        } else {
            System.out.println("\nMultiple Logger instances exist.");
        }
    }
}