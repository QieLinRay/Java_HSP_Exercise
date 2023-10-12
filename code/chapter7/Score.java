public class Score{
	public static void main(String[] args){
		a demo = new a();
		System.out.print(demo.print("a", 1, 2, 3));

	}
}

class a{
	// public void print(String str, double... score){
	// 	double sum = 0;
	// 	for(int i = 0; i < score.length; i ++){
	// 		sum += score[i];
	// 	}
	// 	System.out.println(str);
	// 	System.out.println(sum);

	// }

	public String print(String name, double... score){
		double sum = 0;
		for(int i = 0; i < score.length; i ++){
			sum += score[i];
		}
		return name + sum;

	}



}