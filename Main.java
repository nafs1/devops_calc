import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	Calculator c =new Calculator();	
        int choice;
	char ch;
	System.out.println("\n============Scientific Calculator============\n");
	 do {
        System.out.println("\n1.Square Root\n2.Factorial\n3.Natural Logarithm\n4.Power\n");
	System.out.print("Enter the operation choice: ");
		choice = sc.nextInt();
		double ans, num;
		int n, result;
		switch(choice)
		{
			case 1:
			    System.out.println("\nEnter the No.: ");
			    //Scanner sc = new Scanner(System.in);
			    num = sc.nextDouble();
			    ans = c.square_root(num);
			    System.out.println("Square Root of " + num + " is = " + ans);
			    break;
                    
		        case 2:
		            System.out.println("\nEnter the No.: ");
			    //Scanner sc = new Scanner(System.in);
		            n = sc.nextInt();
		            result = c.factorial(n);
		            System.out.println(n+"!"+" = " + result);
		            break;

		        case 3:
		            System.out.println("\nEnter the No.: ");
			    //Scanner sc = new Scanner(System.in);
			    num = sc.nextDouble();
		            ans = c.natural_log(num);
		            System.out.println("Natural Logarithm of " + num + " is = " + ans);
		            break;

		        case 4:
		            //Scanner sc = new Scanner(System.in);
		            System.out.println("\nEnter base: ");
		            double base = sc.nextDouble();
		            System.out.println("Enter exponent: ");
		            double exp = sc.nextDouble();
		            ans = c.power_fn(base,exp);
		            System.out.println("Result = " + ans);
		            break;

		        default:
		            System.out.println("Wrong Choice entered\n");
		}
		
		System.out.print("\nDo you wish to continue: Y/N ? ");
		ch = sc.next().charAt(0);

	    }while(ch == 'Y' || ch == 'y');
        
	System.out.println("Bye");

    }
}
