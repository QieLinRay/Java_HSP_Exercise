import java.util.Scanner;//������зֺ�
public class switch01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������ַ�");
		char c1 = myScanner.next().charAt(0);	//����һ���ַ�����
		switch(c1) { // switchСд
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
				System.out.println("�������");			

		}


	}
}