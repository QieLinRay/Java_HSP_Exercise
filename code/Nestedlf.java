import java.util.Scanner;
public class Nestedlf{
	public static void main(String[] args){
		Scanner myScanner1 = new Scanner(System.in);
		System.out.println("请输入成绩");
		double grade = myScanner1.nextDouble();
		System.out.println("please input your gender,M OR F");
		//String gender = myScanner1.next();
		char gender = myScanner1.next().charAt(0);
		if(grade > 8.0){
			if(gender == 'M'){
				System.out.println("进入男子组组总决赛");
			}else{
				System.out.println("进入女子组总决赛");
			}

		}
		else{
			System.out.println("THANKS FOR YOUR PARTICIPATION");
		}

	}}