import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
//        String champion = "";
//        int i=1;
//        String input = "";
//        do {
//            input = StdIn.readString();
//            double poss = 1./i;
//            boolean check = StdRandom.bernoulli(poss);
//            if(check) {
//                champion = input;
//            };
//            i++;
//        } while(!StdIn.isEmpty());
//        System.out.println(champion);
//    }
        String champion = "";
        int i=1;
        for (String word : args) {
            if(StdRandom.bernoulli(1./i)) {
                champion = word;
            };
            i++;
        }
        System.out.println(champion);
    }
}
