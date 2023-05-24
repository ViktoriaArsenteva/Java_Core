package Project;

public class Decorator {
    public static String description(int a, int b, int result) {

        return String.format("a = " + a + "\n"
                            + "b = " + b + "\n"
                            + "Result = %d.", result);
    }
}
