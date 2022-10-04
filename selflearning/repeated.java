package selflearning;
import java.util.*;

public class repeated {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int c=0;
	        int n=sc.nextInt();
	        int[] ar=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            ar[i]=sc.nextInt();
	        }   
	        for(int j=0;j<n;j++)
	        {
	            for(int k=0;k<n-1;k++)
	            {
	            if (ar[j]==ar[k+1])
	            c++;
	            }    
		    }
	        System.out.println(c);
	}
	}

