import java.util.Scanner;

public class Program_1 {
	

	
	public static void main(String args[])
			{
		
	Scanner scan = new Scanner(System.in);
	String addition,SubStraction,Multiplication,Division;
	System.out.println("choose an operator:Addition,SubStraction,Multiplication,Division");
	String operator=scan.nextLine();
	System.out.println("enter'a'");
	double a = scan.nextDouble();

	System.out.println("enter'b'");
	double b = scan.nextDouble();
	double res;
	switch(operator)
	{
	case("Addition"):res=a+b;
	System.out.println(a+"+"+b+"="+res);
	break;

	case("Substraction"):res=a-b;
	System.out.println(a+"-"+b+"="+res);
	break;

	case("Multiplication"):res=a*b;
	System.out.println(a+"*"+b+"="+res);
	break;

	case("Division"):res=a/b;
	System.out.println(a+"/"+b+"="+res);
	break;

	default:
		System.out.println("invalid choice");
		break;

	}

	}
	}


