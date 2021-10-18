import java.util.Arrays;   
public class SortArray  
{   
public static void main(String[] args)   
{   
int [] arr = new int [] {9, 3, 5, 9, 12, 2, 7, 4};  
Arrays.sort(arr);   
System.out.println("Elements of array  in increasing order: \n");  
for (int i = 0; i < arr.length; i++)   
{       
System.out.println(arr[i]);   
}   
}  
}  