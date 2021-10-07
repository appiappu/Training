import java.util.*;
 
// Main class
public class CollectinosInJava2 {
   
    // Main driver method
    public static void main(String[] args)
    {
        // Demonstrating Set using HashSet
        // Declaring object of type String
        Set<String> hash_Set = new HashSet<String>();
 
        // Adding elements to the Set
        // using add() method
        hash_Set.add("appi");
        hash_Set.add("appu");
        hash_Set.add("gopi");
        hash_Set.add("tofil");
        hash_Set.add("select");
 
        // Printing elements of HashSet object
        System.out.println(hash_Set);
    }
}