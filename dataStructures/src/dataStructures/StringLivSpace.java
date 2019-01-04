package dataStructures;

public class StringLivSpace {
	
	static String returnB (String a){
		String b = "-1";
		if( a == null || a.length() ==1)
			return b;
		Boolean ifExists = false;
		Boolean allSameChars = false;
		Character ch = a.charAt(0);
		int pos = 0;
		for(int i = 0 ;i < a.length();i++){
			if(a.charAt(i) != a.charAt(0)){
				allSameChars = false;
				break;
			}
			else
				allSameChars = true;
		}
		
		if (allSameChars) return b;
		for(int i = 1; i <a.length();i++){
			if(a.charAt(i) == ch){
				ifExists = true;
				pos = i;
			}
		}
			//Method one when 
		 if (ifExists){
			StringBuilder sb = new StringBuilder();
			sb.append( a.substring(0 , pos +1));
			sb.append(a);
			return sb.toString();
		}
		return b;
	}

		public static void main(String[] args) {
			
//			String a = "aaabcd";
//			String a = "x";
//			String a ="xxxx";
			String a = "xyz";
			System.out.println(returnB(a));
	
}
}
