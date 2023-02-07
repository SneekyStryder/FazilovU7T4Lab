import java.util.ArrayList;

public class Runner1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jessica");
        names.add("Abby");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");
        names.add("Jim");

        System.out.println("BEFORE: " + names);

        // write a loop below to traverse names and insert "hi!" after any
        // name that contains the letter "i"
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).contains("i")) {
                names.add(i + 1, "hi!");
                i++;
            }
        }


        System.out.println("AFTER: " + names);


    }
}
