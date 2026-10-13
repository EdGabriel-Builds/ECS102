/**
 * StringSpeed - STARTER (stretch task)
 * Question: does building a String with += cost more time than StringBuilder?
 * Run it, record both times, and explain the difference in one sentence.
 */
public class StringSpeed {

    public static void main(String[] args) {
        int n = 20000;

        // 1. Build a long String with += (given)
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "t";
        }
        long plusTime = System.nanoTime() - start;

        // 2. TODO: build the same text with a StringBuilder.
        //    StringBuilder sb = new StringBuilder();  then  sb.append("t");
        //    At the end: String t = sb.toString();
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("t");
        }
        String t = sb.toString();
        long builderTime = System.nanoTime() - start;

        System.out.println("Same text? " + s.equals(t));
        System.out.println("+= time (ms): " + plusTime / 1_000_000.0);
        System.out.println("StringBuilder time (ms): " + builderTime / 1_000_000.0);

        System.out.println();
        System.out.println("The difference comes down to the fact that concatenating creates a new string object,");
        System.out.println("but StringBuilder creates the text all at once without re-creating the string.");
    }
}
