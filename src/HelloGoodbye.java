import edu.princeton.cs.algs4.StdIn;

public class HelloGoodbye {
    public static void main(String[] args) {
        String in1 = StdIn.readString();
        String in2 = StdIn.readString();
        System.out.println("Hello " + in1 + " and " + in2);
        System.out.println("Goodbye " + in2 + " and " + in1);
    }
}
