import java.util.ArrayList;

public class pr23 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("world");
        words.add("java");
        System.out.print("Original List: ");
        System.out.println(words);
        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).toUpperCase());
        }
        System.out.print("Uppercase List: ");
        System.out.println(words);
    }
}