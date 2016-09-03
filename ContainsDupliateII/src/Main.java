import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		System.out.println(m.containsNearbyDuplicate(new int[]{2,2}, 3));
	}
	
	public boolean containsNearbyDuplicate(int[] nums, int k){
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				int low = map.get(nums[i]);
				if(i-low<=k){
					return true;
				}
			}else{
				map.put(nums[i], i);
			}
		}
		return false;
	}
}
