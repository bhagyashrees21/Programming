
import java.util.Scanner; 

public class Program_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the 'n' value");
		int n =scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<1+1;j+=2)
				{
					System.out.print(j);
				}
				System.out.println();
			}
		}
				
	}

}
