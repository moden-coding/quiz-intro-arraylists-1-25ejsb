import java.util.*;

public class App {

    //Write code that will:
    //1. Store the following values in an ArrayList: "Java", "Python", "JavaScript"
    //   The name of the ArrayList is up to you.
    //2. Print the contents of your ArrayList using loops. This should work even if 
    //   I add more elements to your ArrayList. For example, I might add "Ruby" to the
    //   ArrayList and this should still work.
    public static void main(String[] args) throws Exception {
        ArrayList<String> values = new ArrayList<>();
        values.add("Java");
        values.add("Python");
        values.add("JavaScript");
        for (String value: values) {
            System.out.println(value);
        }
    }
}
