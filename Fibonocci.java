package week1.day1;

public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0;
		int secNum=1;
		int sum=0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=2; i<=11; i++)
		{
			sum=firstNum+secNum;
			System.out.println(sum);
			firstNum=secNum;
			secNum=sum;
			
		}
		
	}

}
