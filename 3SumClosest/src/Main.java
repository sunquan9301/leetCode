import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(threeSumClosest(new int[]{1,1,1,0}, 100));
	}
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums.length<3){
            return 0;
        }
        int result=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            if(i==0||nums[i]!=nums[i-1]){
                int temp = nums[i];
                int left = i+1;
                int right = nums.length-1;
                while(left<right){
                    if(nums[left]+nums[right]<target-temp){
                        if(left==i+1||nums[left]!=nums[left-1]){
                            if(Math.abs(nums[left]+nums[right]+temp-target)<max){
                                result = nums[left]+nums[right]+temp;
                                max = Math.abs(nums[left]+nums[right]+temp-target);
                            }
                            left++;
                        }else{
                            left++;
                        }
                    }else if(nums[left]+nums[right]>target-temp){
                        if(left==i+1||nums[left]!=nums[left-1]){
                            if(Math.abs(nums[left]+nums[right]+temp-target)<max){
                                result = nums[left]+nums[right]+temp;
                                max = Math.abs(nums[left]+nums[right]+temp-target);
                            }
                            right--;
                        }else{
                            left++;
                            right--;
                        }
                    }else if(nums[left]+nums[right]==target-temp){
                        return target;
                    }
                }
            }
        }
        return result;
    }
}
