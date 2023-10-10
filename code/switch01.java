import java.util.Scanner;//后面带有分号
public class switch01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入字符");
		char c1 = myScanner.next().charAt(0);	//接受一个字符！！
		switch(c1) { // switch小写
			case 'a' :
				System.out.println("Monday");
				break;
			case 'b' :
				System.out.println("TuesDay");
				break;
			case 'c' :
				System.out.println("WednesDay");
				break;
			default:
				System.out.println("输入错误");			

		}


	}
}