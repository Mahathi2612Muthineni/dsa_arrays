
import java.util.*;
import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of array elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Reverse: ");
		System.out.println(Arrays.toString(arr));
		int left =0;
		int right = arr.length-1;
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.println("After reverse: ");
		System.out.print(Arrays.toString(arr));
		
		// TODO Auto-generated method stub

	}

}
