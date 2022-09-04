package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		boolean flag= false;
		
		for(int i=2;i<n; i++)
		{
			if(n%i==0)
			{
				flag = true;
				
		break;
			}
		}
			if(!flag)
			{
				System.out.println(n+ "is a prime number");
			}
			else
			{
				System.out.println("It is not a prime number");
			}		
	}

}
