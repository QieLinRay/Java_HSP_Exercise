public class ForExercise{
	public static void main(String[] args){
		// int count = 0;
		// for(int i = 1; i <= 100; i ++){
		// 	if (i % 9 == 0){
		// 		count += 1;
		// 		System.out.println(i);
		// 		System.out.println(count);

		// 	}
		// }


		//输出使得和为5的两个整数的所有组合情况
		for (int i = 0 ; i <= 5 ; i ++) {
			for (int j = 0; j <= 5; j ++){
				if (i + j == 5){
					System.out.println(i + " + " + j + "= 5");
				}
			}
		}
	}}
