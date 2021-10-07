import java.util.*;    
class Collections4 {    
int id;    
String name,author,publisher;    
int quantity;    
public Collections4(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    
public class MapExample {    
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,Collections4> map=new LinkedHashMap<Integer,Collections4>();    
    //Creating Books    
    Collections4 b1=new Collections4(101,"Let us C","Yashwant Kanetkar","BPB",8);    
    Collections4 b2=new Collections4(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
    Collections4 b3=new Collections4(103,"Operating System","Galvin","Wiley",6);    
    //Adding Books to map   
    map.put(2,b2);  
    map.put(1,b1);  
    map.put(3,b3);  
      
    //Traversing map  
    for(Map.Entry<Integer, Collections4> entry:map.entrySet()){    
        int key=entry.getKey();  
        Collections4 b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
    }    
}    
} 