public class ReverseArray{
	public static void main(String[] args){
		int[] arr1 = {11, 22, 33, 88, 99};
		// int left = 0;
		// int right = arr1.length - 1;
		// while (left < right){
		// 	int leftNumber =  arr1[left];
		// 	int rightNumber = arr1[right];
		// 	int tempNumber = arr1[left];
		// 	arr1[left] = rightNumber;
		// 	arr1[right] = tempNumber;
		// 	left += 1;
		// 	right -= 1;

		// }
		// for (int i  = 0; i < arr1.length; i ++){
		// 	System.out.print(arr1[i] + " ");
		// }

		for( int i = 0; i < arr1.length/2; i ++){
			int left = i;
			int right = arr1.length - 1 - i;
			// int leftNumber = arr1[left];
			// int rightNumber =arr1[right];
			int temp = arr1[left];
			arr1[left] = arr1[right];
			arr1[right] = temp;
		}
		for (int i  = 0; i < arr1.length; i ++){
			System.out.print(arr1[i] + " ");
		}






	}
}