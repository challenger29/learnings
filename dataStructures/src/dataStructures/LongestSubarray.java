package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class LongestSubarray {
	

	public static List<Integer> LongestSubarrayNumber(int[] arr){
//		int[] result = new int[arr.length];
//		int value = arr[arr.length -1];
//		if( arr[0]> value ) result[0] = 1;
//		else
//			result[0]= 0;
//		for(int i = 1 ; i < arr.length - 1; i++ ){
//			if(arr[i] > value){
//				result[i] = result[i-1]++;
//			}
//			else
//				result[i]= 0;
//			System.out.println(Arrays.toString(result));
//		}
//		for(int i = arr.length -2 ; i >= 0 ; i--){
//			if(i)
//		}
//		return -1;
		List<Integer> result = new ArrayList<>();
		List<Integer> currentArray = new ArrayList<>();
		int value = arr[arr.length -1];
		for(int i = 0 ; i < arr.length -1; i++){
			if (arr[i] > value){
				currentArray.add(arr[i]);
			}
			else{
				currentArray.clear();
			}
			if(currentArray.size() > result.size()){
				result.clear();
				result.addAll(currentArray);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr = { 6 , 2 ,4 , 5, 8, 3};
		System.out.println("Function on" +  LongestSubarrayNumber(arr).toString());
		
	}

}
