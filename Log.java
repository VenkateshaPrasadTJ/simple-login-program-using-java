import java.util.Scanner;
class login{
	String f_name,l_name,u_name,passwrd,country;
	int age;
	String user_name,user_pswrd;
	Scanner in = new Scanner(System.in);
	public void input()
	{
	System.out.println("Enter the First name:");
	f_name=in.next();
	System.out.println("Enter the Last name:");
	l_name=in.next();
	System.out.println("Enter the User name:");
	u_name=in.next();
	System.out.println("Enter the Password:");
	passwrd=in.next();
	System.out.println("Enter the Age:");
	age=in.nextInt();
	System.out.println("Enter the country:");
	country=in.next();

	}
	public void check_display()
	{
		System.out.println("\n Login\n");
		System.out.println("Enter User name");
		user_name=in.next();
		System.out.println("Enter the password:");
		user_pswrd=in.next();
		if(user_name.equals(u_name) && user_pswrd.equals(passwrd))
		{
			System.out.println("Successfull");
		}
		else
		{
			System.out.println("invalid");
		}
	}
	public static void main(String args[])
	{
		login a=new login();
		a.input();
		a.check_display();
 }
}
