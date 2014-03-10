public class Solution {
    public int evalRPN(String[] tokens) {
		String[] operators = { "+", "-", "*", "/" };
		int[] stack = new int[tokens.length];
		int result = 0;
		int i = 0,j=0;

		while (i != tokens.length) {
			if (tokens[i].equals(operators[0])){
				stack[j-2]=stack[j-2] + stack[j-1];
				j=j-1;
			}
			else if (tokens[i].equals(operators[1])){
				stack[j-2]=stack[j-2] - stack[j-1];
				j=j-1;
			}
			else if (tokens[i].equals(operators[2])){
				stack[j-2]=stack[j-2] * stack[j-1];
				j=j-1;
			}
			else if (tokens[i].equals(operators[3])){
				stack[j-2]=stack[j-2] / stack[j-1];
				j=j-1;
			}
			else {
				stack[j] = Integer.parseInt(tokens[i]);
				j++;
			}
			i++;
		}
		result = stack[0];
		return result;
    }
	
}