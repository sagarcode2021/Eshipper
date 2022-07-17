package eShipper;

public class IncomeTax {

	private double[][] get_tax_rates(String Country)
	{
		double[][] arr = null;
		//arr=GET Function which returns the values as
		//1-> Flat Rate
		//arr[0]--->|NULL|15|
		//2-> Incremental Rate
		//arr[0]--->|2,50,000|5|
		//arr[1]--->|5,00,000|10|
		//arr[2]--->|10,00,000|15|
		//arr[3]--->|NULL|20|
		return arr;
	}
	public double getIncomeTax(double income)
	{
		double tax=0;
		double arr[][]=get_tax_rates("country_name");
		int len=arr.length;
		if(len==1)
		{
			tax=(income*arr[0][1])/100;
		}
		else
		{
			double prev=0;int i=0;
			while(i<len-1)
			{
				if(income>=arr[i][0])
				{
					tax+=arr[i][0]*arr[i][1]/100;
					income-=(arr[i][0]-prev);
					prev=arr[i][0];
					i++;
				}
				else
				{
					tax+=income*arr[i][1]/100;
					break;
				}
			}
			if(i==len-1)
				tax+=income*arr[len-1][1]/100;
		}
		return tax;
	}
}
