import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7,8,9,11,13 };
		
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			int randomindex = rand.nextInt(arr.length);
			int temp = arr[randomindex];
			arr[randomindex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
