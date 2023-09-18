import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean isArmstrong(int num)
	{
	    // wrtie your code here;
		String str = Integer.toString(num);
		int size = str.length();
		int check = num;
		int sum = 0;
		while(num>0){
			long temp = num%10;
			sum += Math.pow(temp,size);
			num = num/10;
		}
		if(sum==check){
			return true;
		}
		return false;
		
	}
}

