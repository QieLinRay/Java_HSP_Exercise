import java.util.Scanner;
public class AddArray{
	public static void main(String[] args){

		//如果第一个不是添加的true,可以直接进入循环，while(true),用key = n,作为判断break的条件即可
		//使用do-while +break 来实现
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
			System.out.println("请问需要继续添加嘛,y/n");
			answer = myScanner.next().charAt(0);
			if(answer == 'y' || answer =='Y'){
				System.out.println("请输入需要添加的数字");
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

		// System.out.println(" 请问需要在数组中添加元素嘛？ y/n");
		// Scanner myScanner = new Scanner(System.in);
		// char answer = myScanner.next().charAt(0);
		// if (answer == 'y' || answer == 'Y'){
		// 	int newLen = arr.length + 1;
		// 	int[] arr1 = new int[newLen];
		// 	for (int i = 0; i < arr.length; i ++){
		// 		arr1[i] = arr[i];
		// 	}

		// 	System.out.println("请输入需要添加的一个数字");
		// 	int number = myScanner.nextInt();
		// 	arr1[newLen - 1] = number;
		// 	arr = arr1;
		// 	for(int i = 0; i < arr.length; i ++){
		// 	System.out.print(arr[i] + " ");
		// }

		// }



	}
}