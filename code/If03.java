import java.util.Scanner;
//import �������
public class If03{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������÷�1-100");
		int grade = myScanner.nextInt();
		//System.out.println("���������÷�");
		// if(grade < 60){
		// 	System.out.println("������");
		// }else{
		// 	if(grade <= 80){
		// 		System.out.println("����һ��");
		// 	}else{
		// 		if(grade <= 99){
		// 			System.out.println("��������");
		// 		}
		// 		else{
		// 			System.out.println("���ü���");
		// 		}
		// 	}
		// }

		// ���⣬�ȶ����ݷ�Χ�����жϣ�String,double,��Ҫ���쳣����
		if(grade >= 1 && grade <= 100){
		//��Ϊ��4������������ö��֧������
			if(grade == 100){
			System.out.println("���ü���");
			}
			else if (grade > 80 && grade <= 99) {
			System.out.println("��������");

			}else if (grade >= 60 && grade <= 80) {
			System.out.println("����һ��");

			}else{
			System.out.println("������");
			}
	}
	else{
		System.out.println("���÷���Ҫ��1-100֮�䣬����������");
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

