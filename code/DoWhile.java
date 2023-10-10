import java.util.Scanner;
public class DoWhile{
	public static void main(String[] args){
		// print 1 ~ 100
		// int i = 1;
		// do{
		// 	System.out.println(i);
		// 	i ++;
		// }while(i <= 100);

		// calculate 1 ~ 100
		// int i = 1;
		// int sum = 0;
		// do{
		// 	sum += i;
		// 	i ++;
		// }while(i <= 100);
		// System.out.println("sum = " + sum);

		// int start = 1;
		// int end  = 200;
		// do{
		// 	if(start % 5 == 0 && start % 3 != 0){
		// 		System.out.println(start);
		// 	}
		// 	start ++;

		// }while(start <= end);

		char c1 = ' ';

		do{
			System.out.println("»¹Ç®Âð£¿");
			Scanner  myScanner = new Scanner(System.in);
			c1 = myScanner.next().charAt(0);
			if(c1 == 'n'){
			System.out.println("5Á¬±Þ");
		}
		}while(c1 == 'n');

	}
}