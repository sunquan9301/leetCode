import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> generate(int numRows){
	
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(numRows<=0)
		return result;
	List<Integer> first = new ArrayList<Integer>();
	first.add(1);
	result.add(first);
	int count = 0;
	while(count<numRows-1){
		List<Integer> old = result.get(result.size()-1);
		List<Integer> newArr = new ArrayList<Integer>();
		for (int i = 0; i < old.size(); i++) {
			if(i == 0){
				newArr.add(1);
				continue;
			}
			int temp = old.get(i)+old.get(i-1);
			newArr.add(temp);
		}
		newArr.add(1);
		result.add(newArr);
		count++;
	}
	return result;
		
	}

}
