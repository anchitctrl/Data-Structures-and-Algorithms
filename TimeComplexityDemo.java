public class TimeComplexityDemo 
{
	
	public static void main(String[] args) 
	{
		double now=System.currentTimeMillis();
		
		TimeComplexityDemo obj=new TimeComplexityDemo();
		System.out.println(obj.findSum(99999));
		
		System.out.println("Time taken = "+ (System.currentTimeMillis()-now) +"milliseconds");

	}
	
//	public int findSum(int n)
//	{
//		return n*(n+1)/2;
//	}
	
	public int findSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}

}
