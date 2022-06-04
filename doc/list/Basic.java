import java.util.List;

public class Basic {
    public static void main(String args[]) {
        // Basic list
    	List<String> list = new ArrayList<String>();

		// Adding
		list.add("C");
		list.add("C++");
		list.add("PHP");
		list.add("Java");
		list.add("JavaScript");
		list.add("Not a language");
		list.add("Not a language");
		list.add("Not a language");

		// Remove
		list.remove("Not a language");   	// Removes first occurrence
		list.remove(5); 				 	// Removes element at a certain index
		list.removeAll("Not a language"); 	// Removes all occurrences
    }
}
