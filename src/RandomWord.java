import edu.princeton.cs.algs4.StdIn;

public class RandomWord {
    public static void main(String[] args) {
//        String champion = "";
//        int i=1;
//        while(StdIn.hasNextLine()) {
//            String input = StdIn.readString();
//            if(Math.random() < 1/i) {
//                champion = input;
//            };
//            i++;
//        }
            for (String line : args) {
                System.out.println(line);
            }

    }
}
