
public class Exercise01 {
	public static void main(String[] args) {
		int [] nums = {3,45,7,8,768,4,3,42,4234,56,4536,45,765,3467};
		
		for (int i : nums) {
			System.out.print(i + " ");
		} 
		
		for (int i = 0; i < nums.length-1; i++) {
			int indexMin = i;
			for (int j = i+1; j < nums.length; j++) {
				if (nums[j]<nums[indexMin]) {
					indexMin=j;
				}
			}
			if (indexMin!=i) {
				int temp = nums[i];
				nums[i] = nums[indexMin];
				nums[indexMin] = temp;
			}
			
		}
		System.out.println();
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
}
