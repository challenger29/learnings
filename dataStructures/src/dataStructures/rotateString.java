package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class rotateString {
	
	
	static int findRotations(String str){
		int n = str.length();
		String temp = str.concat(str);
		for(int i = 1 ; i <= n ; i++){
			String substr = temp.substring(i , i+ n );
			if(str.equals(substr))
				return i;
		}
		return -1;
	}
    public static void main(String[] args)
    {
            String str = "abc";
        System.out.println(findRotations(str));
        List<Integer> arrList = new ArrayList<>();
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);
        arrList.add(8);
        Iterator<Integer> iter = arrList.iterator();
        while(iter.hasNext()){
        	System.out.println(iter.next());
        }
        
        List<Integer> subList = arrList.subList(1, 3);
        System.out.println(subList.toString());
        int[][] a = new int[3][4];
        for(int[] ai : a){
        	Arrays.fill(ai, 0);
        }
        
        
        for (int[] innerArray: a) {
            for(int data: innerArray) {
               System.out.print(data);
            }
            System.out.println();
         }

        }
    

}
