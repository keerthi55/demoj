import java.util.*;
class As 
{
	public static void main(String[] args) 
	{
		String s[] = new String [2];
		Scanner scan=new Scanner(System.in);
		int a[][]=new int[2][];
		 a[0]=new int[2];
		 a[1]=new int[2];
		for (int i=0;i<=a.length-1;i++ )
		{
			System.out.println("enter the  "+i+"st bank name");
			s[i]=scan.next();
			for (int j=0;j<=a[i].length-1;j++ )
			{
				System.out.println("enter the bank "+s[i]+"  and baranch "+j);
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Hello World!");
	}
}
