import java.util.*;
class login{
	 public static void main(String[] args)
	 {
		  String f_name,L_name,U_name,password,country;
		  int age;
          String user_name,new_password;
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter the First Name:");
		  f_name=input.next();
		  System.out.println("Enter the Last Name:");
		  L_name=input.next();
		   System.out.println("Enter the User Name:");
		   U_name=input.next();
		    System.out.print("Enter the Password:");
		    password=input.next();
		     System.out.print("Enter the country:");
		     country=input.next();
		     System.out.print("Enter the Age:");
		     age=input.nextInt();
		      System.out.print("\n Login \n");
		       System.out.print("Enter the user name:");
		       user_name=input.next();
		        System.out.print("Enter the password:");
		        new_password=input.next();
		        if(user_name.equals(U_name) && new_password.equals(password))
		        {
					 System.out.print("logged in successfull:");
			}
			else
			{
				 System.out.print("invalid:");
		 }



}
}
