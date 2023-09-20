package myself;
public class SwapTwoNumbers 
{
public static void main(String[] args) 
{
	int a=10, b=20;
	System.out.println("Before swapping the values are a="+a+",b="+b);
	swapTwoNumbers( a,b );
	
}
public static void swapTwoNumbers(int a,int b)
{
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping the values are a="+a+",b="+b);
}
}
