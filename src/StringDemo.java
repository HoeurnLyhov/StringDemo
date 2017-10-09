import java.util.Scanner;
public class StringDemo 
{

	public static void main(String[] args) 
	{
		String userName,pass;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter user name: ");
		userName=s.next();
		System.out.println("Enter passwork: ");
		pass=s.next();
		
		if(userName.equals("Lyhov")&& pass.equals("1234"))
		{
			System.out.println("Login Sucess...");
			char ch[]=userName.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				System.out.print(""+ch[i]);
			}
		}
		else
		{
			System.out.println("Incorrech...");
		}
		
	}

}
