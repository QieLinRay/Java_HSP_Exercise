import java.util.Scanner;
public class ForHomework01{
	public static void main(String[] args){
		int sum = 0;

		for (int i = 1; i <= 100; i ++){
			for (int j = 1; j <= i; j ++){
				sum += j;
			}

		}
		System.out.println(sum);

		// int flag = 1;
		// double sum = 0;
		// for (int i = 1; i <= 100; i ++){
		// 	System.out.println(flag * (1.0 / i));
		// 	sum += flag * (1.0 / i);
		// 	flag *= -1;

		// }
		// System.out.println(sum);


		// for( char c1 = 'a'; c1 <= 'z'; c1++){
		// 	System.out.print(c1 + " ");
		// }
		// System.out.println();
		// for( char c1 = 'A'; c1 <= 'Z'; c1 ++){
		// 	System.out.print(c1 + " ");
		// }

		// ���1-100֮�䲻�ܱ�5����������ÿ��5��
		// int count = 0;
		// for ( int i = 1 ; i <= 100 ; i ++){
		// 	if( i % 5 != 0 ){
		// 		System.out.print(i + " ");
		// 		count += 1;
		// 		if (count % 5 == 0){
		// 		System.out.println();
		// 	}
		// 	}
		// 	// if (count % 5 == 0){
		// 	// 	System.out.println();
		// 	// }

		// }
		

		// ˮ�ɻ���
		// Scanner myScanner = new Scanner(System.in);
		// while(true){
		// 	System.out.println("������һ����λ������0�˳�");
		// 	int Number = myScanner.nextInt();
		// 	if ( Number == 0){
		// 		break;
		// 	}
		// 	else if ( Number < 100 || Number > 1000){
		// 		continue;
		// 	}
		// 	else{
		// 		int sum = math.pow(Number/100, 3) + math.pow(Number)
		// 	}

		// }



		//02
		// Scanner myScanner = new Scanner(System.in);
		// while(true){
		// 	System.out.println("������һ����,����0�˳�");
		// 	double number = myScanner.nextDouble();
		// 	if(number > 0){
		// 		System.out.println("����0");
		// 	}
		// 	else if(number < 0){
		// 		System.out.println("С��0");

		// 	}
		// 	else{
		// 		break;
		// 	}

		// }


		//01
		// double money = 100000;
		// int count = 0;
		// while (money >= 1000){
		// 	if ( money >= 50000){
		// 		money = 0.95 * money;
		// 		count += 1;
		// 		System.out.println(money);
		// 	}
		// 	if( money < 50000){
		// 		money -= 1000;
		// 		count += 1;
		// 		System.out.println(money);
		// 	}
		// }
		// System.out.println(count);





		// while(true){
		// 	if (money >= 50000) {
		// 		money = 0.95 * money;
		// 		count += 1;
		// 		System.out.println(money);		
		// 	}
		// 	else if (1000 < money  && money < 50000) {//<50000���Բ�Ҫ
		// 		money -= 1000;
		// 		count += 1;
		// 		System.out.println(money);
				
		// 	}
		// 	else{
		// 		break;
		// 	}			
		// }
		// System.out.println(count);





		// while(true){
		// 	if (money >= 50000) {
		// 		money = 0.95 * money;
		// 		count += 1;
		// 		System.out.println(money);		
		// 	}
		// 	else if (0 < money  && money < 5000) {
		// 		money -= 1000;
		// 		count += 1;
		// 		System.out.println(money);
				
		// 	}
		// 	else{
		// 		break;
		// 	}			
		// }
		// System.out.println(count);

	}
}