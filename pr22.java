import java.util.ArrayList;

public class pr22 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Giraffe");
        String longest = animals.get(0);
        for (String animal : animals) {
            if (animal.length() > longest.length()) {
                longest = animal;
            }
        }
        System.out.printf("Longest String: %s\n", longest);
    }
}