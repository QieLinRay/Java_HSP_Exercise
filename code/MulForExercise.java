import java.util.Scanner;
public class MulForExercise{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		double sumAll = 0;
		double sum;
		int count = 0;
		for ( int i = 0; i < 3; i ++){
			sum = 0;
			for ( int j = 0; j < 5; j ++){
				System.out.println("请输入成绩");
				double score = myScanner.nextDouble();
				sumAll += score;
				sum += score;
				if (score >= 60){
					count += 1;
				}
			}
			System.out.println(i + "班平均分="+(sum/5));
		}
		System.out.println("总平均分="+(sumAll / (3 * 5)));
		System.out.println("总及格人数为"+ count);
	}
}