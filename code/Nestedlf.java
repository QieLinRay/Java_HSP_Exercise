import java.util.Scanner;
public class Nestedlf{
	public static void main(String[] args){
		Scanner myScanner1 = new Scanner(System.in);
		System.out.println("������ɼ�");
		double grade = myScanner1.nextDouble();
		System.out.println("please input your gender,M OR F");
		//String gender = myScanner1.next();
		char gender = myScanner1.next().charAt(0);
		if(grade > 8.0){
			if(gender == 'M'){
				System.out.println("�������������ܾ���");
			}else{
				System.out.println("����Ů�����ܾ���");
			}

		}
		else{
			System.out.println("THANKS FOR YOUR PARTICIPATION");
		}

	}}