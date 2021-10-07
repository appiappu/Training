import java.util.*;  
public class CollectionsInJava3
{  
        public static void main(String[] args)
        {
            Set<Integer> s1=new HashSet<>();
            s1.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6}));
            Set<Integer> s2=new HashSet<>();
            s2.addAll(Arrays.asList(new Integer[]{5,2,4,8,9,6}));
            
            Set<Integer>union=new HashSet<>(s1);
            union.addAll(s2);
            System.out.println("the union elements are:"+union);
            Set<Integer> intersection=new HashSet<>(s1);
            intersection.retainAll(s2);
            System.out.println(intersection);
            Set<Integer>difference=new HashSet<>(s1);
            difference.removeAll(s2);
            System.out.println("the defference is :"+difference);
        }
}