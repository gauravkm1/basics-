package selflearning;
import java.util.Scanner;
public class Bs 
{
public static void bs(int ar[],int low,int x,int high)
{
  
 int mid=(low+high)/2;
 while(high>low)
 {
	if(x<ar[mid])
	{
		low=mid+1;
	}
	else if(x==ar[mid])
	{
		System.out.print("element is found at index"+ar[mid]);
		break;
	}
	else 
	{
	high=mid-1;	
	}
	mid=(high+low)/2;
 }
 if(high<low)
 {
	 System.out.print("element not found");
 }}
 public static void main(String args[])
 {
	 int ar[]= {3,4,7,8,9,34};
	 int element=8;
	 int high=ar.length-1;
	 bs(ar,0,element,high);
 }
}