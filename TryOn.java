public class TryOn {

    public static void fungsiVarargs(String...args) {
        for (String arg : args) {
            System.out.println("Ini adalah String: " + arg);
        }
    } public static void main(String[] args) {
        fungsiVarargs("Hello", "World", "Java");
            
    }
}

