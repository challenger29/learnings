package dataStructures;

import java.util.ArrayList;

public class PrettyPrint {
    public static ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        int m , n ;
        int dir= 0;
        int row = 0;
        int col = 0;
        int layer = 0;
        m = n =  A * 2 - 1;
        // n = A * 2 - 1;
        int value = A;
        for(int i  = 0 ; i < m ; i++){
            result.add(new ArrayList<Integer>(m));
        }
        for( int i = 0 ; i < m ; i ++){
            for (int j = 0 ; j < m ; j++){
                result.get(i).add(0 , 0);
            }
        }
        
        for( int i = 0 ; i < m ; i ++){
            for (int j = 0 ; j < m ; j++){

                System.out.print(result.get(i).get(j));
            }
            System.out.println();
        }
        result.get(0).set(0 , value);
        
        for (int step = 1 ; step < m * m ; step++){
            
            switch (dir){
                case 0: if( col < n - layer - 1){
                    dir = 1;
                    row++;
                }
                else
                    col++;
                    break;
                case 1:
                    if (row == m - layer - 1){
                        dir = 2;
                        col--;
                    }
                    else
                        row++;
                    break;
                case 2:
                    if(col ==layer){
                        dir =3;
                        row--;
                    }
                    else
                        col--;
                    break;
                case 3:
                    if(row ==layer +1){
                        dir = 0;
                        col++;
                        layer++;
                        value--;
                    }
                    else
                        row--;
                    break;
            }
            System.out.println(row +" " +  col +" " +  dir +" " + value);
//            result.get(row).add(col , value);
        }
        System.out.println("After computation");
        for( int i = 0 ; i < m ; i ++){
            for (int j = 0 ; j < m ; j++){

                System.out.print(result.get(i).get(j));
            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
    	System.out.println("main func");
    	prettyPrint(4);
		
	}

}
