package myself;

public class SwapNumberUsingTemp {
	public static void main(String[] args) 
	{
		int a=10, b=20;
		System.out.println("Before swapping the values are a="+a+",b="+b);
		swapTwoNumbers( a,b );
		
	}
	public static void swapTwoNumbers(int a,int b)
	{
		
		int temp = a ;
		a=b;
		b=temp;
		System.out.println("After swapping the values a="+a+",b="+b);
	}
	}

    