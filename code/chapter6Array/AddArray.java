import java.util.Scanner;
public class AddArray{
	public static void main(String[] args){

		//�����һ��������ӵ�true,����ֱ�ӽ���ѭ����while(true),��key = n,��Ϊ�ж�break����������
		//ʹ��do-while +break ��ʵ��
		int[] arr = {1,2,3};
		Scanner myScanner = new Scanner(System.in);
		int[] arrNew = new int[arr.length + 1];
		for ( int i = 0; i < arr.length ; i ++){
			arrNew[i] = arr[i];
		}
		arrNew[arrNew.length - 1] = 4;	
		arr = arrNew;
		for(int i = 0; i < arr.length; i ++){
			System.out.print(arr[i] + " ");
		}
		char answer;
		do{
			System.out.println("������Ҫ���������,y/n");
			answer = myScanner.next().charAt(0);
			if(answer == 'y' || answer =='Y'){
				System.out.println("��������Ҫ��ӵ�����");
				int number = myScanner.nextInt();

				arrNew = new int[arr.length + 1];
				for ( int i = 0; i < arr.length ; i ++){
					arrNew[i] = arr[i];
				}
				arrNew[arrNew.length - 1] = number;	
				arr = arrNew;
				for(int i = 0; i < arr.length; i ++){
					System.out.print(arr[i] + " ");
					}
			}
		}while(answer == 'y' || answer == 'Y');

		// System.out.println(" ������Ҫ�����������Ԫ��� y/n");
		// Scanner myScanner = new Scanner(System.in);
		// char answer = myScanner.next().charAt(0);
		// if (answer == 'y' || answer == 'Y'){
		// 	int newLen = arr.length + 1;
		// 	int[] arr1 = new int[newLen];
		// 	for (int i = 0; i < arr.length; i ++){
		// 		arr1[i] = arr[i];
		// 	}

		// 	System.out.println("��������Ҫ��ӵ�һ������");
		// 	int number = myScanner.nextInt();
		// 	arr1[newLen - 1] = number;
		// 	arr = arr1;
		// 	for(int i = 0; i < arr.length; i ++){
		// 	System.out.print(arr[i] + " ");
		// }

		// }



	}
}