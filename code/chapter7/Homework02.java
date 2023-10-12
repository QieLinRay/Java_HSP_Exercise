public class Homework02{
	public static void main(String[] args){
		A02 a = new A02();
		System.out.print(a.find('a',""));

	}
}
 class A02{
 	public int find(char c, String str){
 		if(str != null && str.length() != 0){
	 		for(int i = 0; i < str.length(); i ++){
	 			if(str.charAt(i) == c){
	 				return i;
	 			}
	 		}
 		}
 		return -1;
 	}
 }