public class MethodExercise{
	public static void main(String[] args){
		Tools tool = new Tools();
		Boolean answer = tool.odd(5);
		System.out.print(answer);
	}

}

class Tools{
	public Boolean odd(int n){
		// if(n % 2 == 0){
		// 	return true;
		// }
		// else{
		// 	return false;
		// }

		return n % 2 == 0 ? true : false;

		//return n % 2 == 0;

	}
}