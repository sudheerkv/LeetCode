public class twosum{
	public static int[] twoSum1(int[] numbers, int target) {
		int i,j;
		int[] result = new int[2];
        	for(i=0; i <numbers.length; i++)
		{
			for(j=i+1; j <numbers.length; j++)
			{
				if(numbers[i] + numbers[j] == target)
				{
					result[0] = i+1;
					result[1] = j+1;
				}
			}
		}
		return result;
    	}

	public static void main(String[] args)
	{
		int[] numbers = new int[4];
		int target =9;
		int[] result = new int[2];
		numbers = new int[] {2,7,5,6};
		result = twoSum1(numbers,target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}
