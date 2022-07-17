package eShipper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class invCpm_a_pc implements Comparator<Stock>{
	@Override
	public int compare(Stock arg0, Stock arg1) {
		return (arg0.productCode.compareTo(arg1.productCode));
	}
}

class invCpm_a_bn implements Comparator<Stock>{
	@Override
	public int compare(Stock arg0, Stock arg1) {
		return (arg0.batchNumber.compareTo(arg1.batchNumber));
	}
}
class invCpm_a_md implements Comparator<Stock>{
	@Override
	public int compare(Stock arg0, Stock arg1) {
		return (arg0.mfgDate.compareTo(arg1.mfgDate));
	}
}
class invCpm_a_ed implements Comparator<Stock>{
	@Override
	public int compare(Stock arg0, Stock arg1) {
		return (arg0.expDate.compareTo(arg1.expDate));
	}
}
class invCpm_a_q implements Comparator<Stock>{
	@Override
	public int compare(Stock arg0, Stock arg1) {
		return (arg0.quantity-arg1.quantity<0?-1:1);
	}
}
class GetInventory{
public List<Stock> getInventory(boolean asc,String attr)
{
List<Stock> result=new ArrayList<>();
//SQL query to get data in stock ArrayList
if (attr.equalsIgnoreCase("productCode"))
{
	Collections.sort(result,new invCpm_a_pc());
	if(asc==true);
	else
		Collections.reverse(result);
	return result;
}
else if (attr.equalsIgnoreCase("batchNumber"))
{
	Collections.sort(result,new invCpm_a_bn());
	if(asc==true);
	else
		Collections.reverse(result);
	return result;
}	
else if (attr.equalsIgnoreCase("mfgDate"))
{
	Collections.sort(result,new invCpm_a_md());
	if(asc==true);
	else
		Collections.reverse(result);
	return result;
}	
else if (attr.equalsIgnoreCase("expDate"))
{
	Collections.sort(result,new invCpm_a_ed());
	if(asc==true);
	else
		Collections.reverse(result);
	return result;
}	
else if (attr.equalsIgnoreCase("quantity"))
{
	Collections.sort(result,new invCpm_a_q());
	if(asc==true);
	else
		Collections.reverse(result);
	return result;
}	
else	
return result;
}
}