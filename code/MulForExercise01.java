public class MulForExercise01{
	public static void main(String[] args){
		// ��ӡ���Ľ�����
		//�ȴ�ӡ����4*3
		for (int i = 0; i < 4 ; i ++){
			for (int j = 0; j < 3; j ++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//�ȴ�ӡ�����Ǿ���
		for (int i = 0; i < 4 ; i ++){
			for (int j = 0; j <= i; j ++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		//��ӡ���������Ǿ���
		for (int i = 0; i < 4 ; i ++){
			for ( int k = 0; k < 4 - i ; k ++){
				System.out.print(" ");
			}
			for (int j = 0; j < (2*i + 1); j ++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		//��ӡ���������Ǿ���
		for (int i = 0; i < 4 ; i ++){
			for ( int k = 0; k < 4 - i ; k ++){
				System.out.print(" ");
			}

			if ( i != 3){
			for (int j = 0; j < (2*i + 1); j ++){
				if (j == 0 || j == 2* i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}	
			}
		}
		else{
			for (int j = 0; j < (2*i + 1); j ++){
				System.out.print("*");
			}

		}



			System.out.println();
		}
		System.out.println();

		//��ӡ���������Ǿ���
		for (int i = 0; i < 4 ; i ++){
			for ( int k = 0; k < 4 - i ; k ++){
				System.out.print(" ");
			}
			for (int j = 0; j < (2*i + 1); j ++){
				if (j == 0 || j == 2* i || i == 3){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		System.out.println();

		//��ӡ���Ľ�����
		for (int i = 0; i < 5 ; i ++){
			for ( int k = 0; k < 5 - i ; k ++){
				System.out.print(" ");
			}
			if ( i == 0 || i == 4){
				for (int j = 0; j < (2*i + 1); j ++){
				System.out.print("*");}
			}else{
				for (int j = 0; j < (2*i + 1); j ++){
					if ( j == 2 * i ){
						System.out.print("*");
					}
				}

			}

			System.out.println();
		}






	}
}