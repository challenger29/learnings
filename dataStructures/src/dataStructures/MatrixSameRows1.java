package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MatrixSameRows1 {
	public static void main(String[] args) {
		int[][] arr = { {1 , 0 , 0 , 1},
						{0 , 0 , 0 , 1} , 
						{1 , 1, 0 , 1},
						{1 , 0 , 0 , 1},
						{0 , 0 , 0 , 1} };
		
		Map<String , Integer> map = new HashMap<>();
		for(int[] innerArray : arr){
			String pattern = Arrays.toString(innerArray);
			if(!map.containsKey(pattern)){
				map.put(pattern, 1);
			}
			else{
				map.merge(pattern , 1 , Integer:: sum);
			}
		}
		map.forEach((k , v) -> {
			if(v >1)
				System.out.println(k);
		});
		
	}

}
