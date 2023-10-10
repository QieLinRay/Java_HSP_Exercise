import java.util.Scanner;
//import 必须存在
public class If03{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入信用分1-100");
		int grade = myScanner.nextInt();
		//System.out.println("请输入信用分");
		// if(grade < 60){
		// 	System.out.println("不及格");
		// }else{
		// 	if(grade <= 80){
		// 		System.out.println("信用一般");
		// 	}else{
		// 		if(grade <= 99){
		// 			System.out.println("信用优秀");
		// 		}
		// 		else{
		// 			System.out.println("信用极好");
		// 		}
		// 	}
		// }

		// 讲解，先对数据范围进行判断，String,double,需要用异常处理
		if(grade >= 1 && grade <= 100){
		//因为有4种情况，所以用多分支来处理
			if(grade == 100){
			System.out.println("信用极好");
			}
			else if (grade > 80 && grade <= 99) {
			System.out.println("信用优秀");

			}else if (grade >= 60 && grade <= 80) {
			System.out.println("信用一般");

			}else{
			System.out.println("不及格");
			}
	}
	else{
		System.out.println("信用分需要在1-100之间，请重新输入");
	}

	boolean b = true;
	if(b = false){
		System.out.println("a");
	}else if (b) {
		System.out.println("b");
		
	}else if (! b) {
		System.out.println("c");
		
	}else {
		System.out.println("d");
	}


	}

}

