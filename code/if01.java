import java.util.Scanner;
//import 必须
public class if01{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入：");
		int age = scanner.nextInt();
		if(age > 18){
			System.out.println("yes");
		}
		System.out.println("程序继续");
	}}
