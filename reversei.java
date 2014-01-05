public class Solution {
	public int reverse(int x) {
		int[] temp = new int[11];
		int i=0;
		int sign =1;
		int result=0;
		int length =0;
		if(x<0)
		{
			sign = -1;
			x = x*sign;
		}
		while(x>=10)
		{
			temp[i++] = x%10;
			x/=10;
		}
		temp[i++] = x;
		temp[i] =-1;
		i=0;
		while(temp[i]!=-1)
		{
			length++;
			i++;
		}
		i=0;
		while(length!=0)
		{
			result += temp[i]*Math.pow(10,length-1);
			i++;
			length--;
		}
		if(result == Integer.MAX_VALUE && sign == -1 && temp[i-1] >=8)
			result = Integer.MIN_VALUE;
		else
			result = result*sign;
		return result;
	}
}
