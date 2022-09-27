import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		
		
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the array length");
				int n = scan.nextInt();
				int arr[] = new int[n];

				//getting the input from user
				System.out.println("Enter the array elements");
				for(int i=0;i<arr.length;i++) {
					arr[i] = scan.nextInt();
				}

				int c[] = new int[9];
				int mul = 0;
				for(int i = 1;i<=9;i++) {
					for(int j = 0;j<arr.length;j++) {
						if(arr[j]%i==0) {
							c[mul]++;
						}
					}
					mul++;
				}
				Dictionary dict = new Hashtable();
				int j = 1;
				for(int i=0;i<9;i++) {
					dict.put(j, c[i]);
					j++;
				}
				System.out.println(dict);
			}
		
	}
