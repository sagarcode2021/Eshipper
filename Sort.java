package eShipper;

public class Sort {
public int secLarg(int[]arr)
{
	int max=Integer.MIN_VALUE,max_2=Integer.MIN_VALUE;
	for(int i:arr)
	{
		if(i>max)
		{
			max_2=max;max=i;
		}
		else if(i>max_2)
		{
			max_2=i;
		}
		
	}
	return max_2;
}
}
