package first;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int s = 0 ;
		if (sc.hasNextLine()) {
			s= sc.nextInt();
		}
		String[] arr = new String[s];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < s;i++) {
			if (sc.hasNextLine()) {
				arr[i] = sc.nextLine();
			}
		}
        System.out.println("The array is:");
        for (int i = 0; i < s;i++ ) {
        	System.out.println(arr[i]);
        }
	}

}
