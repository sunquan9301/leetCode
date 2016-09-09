import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{1,2,3,4,5,6,7};
		rotate(a,3);
	}
	public static void rotate(int[] nums, int k){
		
		String str = "";
		for (int i = 0; i < nums.length; i++) {
			str+=nums[i];
		}
		
		//System.out.println(str);
		str = str+str;
		//System.out.println(str);
		char[] c = str.substring(nums.length-k, nums.length-k+nums.length).toCharArray();
		//System.out.println(Arrays.toString(c));
		for (int i = 0; i < c.length; i++) {
			nums[i] = c[i]-'0';
		}
		//System.out.println(Arrays.toString(nums));
	}
}
