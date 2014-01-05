public class Solution {
	public int atoi(String str) {
		int count =0;
		int sign =1;
		int i=0;
		int result =0;
		int length =0;
		int[] temp = new int[str.length()+1];
		if(str.length()==0)
			return 0;
		while(Character.isWhitespace(str.charAt(count))) {
			count++;
			if(count == str.length())
				break;
		}
		/*while(count!=str.length() && Character.isLetter(str.charAt(count))) {
			count++;
			if(count == str.length())
				break;
		}*/
		if(count!=str.length()) {
			if(str.charAt(count) == '+') {
				count++;
			}
			if(str.charAt(count) == '-') {
				sign = -1;
				count++;
			}
			if(Character.isLetter(str.charAt(count))) {
				return 0;
			}
			while(Character.isDigit(str.charAt(count))) {
				temp[i] =Character.getNumericValue(str.charAt(count));
				i++;
				count++;
				if(count == str.length())
					break;
			}	
			temp[i] = -1;
			i=0;
			while(temp[i]!=-1) {
				length++;
				i++;
			}
			if(length>10)
			{
				if(sign==-1)
					result = Integer.MIN_VALUE;
				else
					result = Integer.MAX_VALUE;
				return result;
			}
			i=0;
			while(length!=0)
			{
				result += temp[i]*Math.pow(10,length-1);
				i++;
				length--;
			}
			if(result == Integer.MAX_VALUE && sign == -1 && temp[i-1] >= 8)
			{
				result = Integer.MIN_VALUE;
			}
			else
				result = result*sign;
		}
		return result;
	}		
}
