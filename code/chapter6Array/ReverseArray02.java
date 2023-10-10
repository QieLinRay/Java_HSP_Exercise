//20231010
public class ReverseArray02{
	public static void main(String[] args){
		int[] arr1 = {1, 2, 3, 88, 99};
		int[] arr2 = new int[arr1.length];
		// for (int i = 0; i < arr1.length ; i ++){
		// 	arr2[i] = arr1[arr1.length - 1 - i];
		// }
		// for (int i = 0; i < arr1.length ; i ++){
		// 	System.out.print(arr2[i] + " ");
		// }



		// //可以逆序遍历arr1,顺序遍历arr2
		// for(int i = arr1.length -1 ; i >= 0; i --){
		// 	arr2[arr1.length -1 - i] = arr1[i];
		// }
		// for (int i = 0; i < arr1.length ; i ++){
		// 	System.out.print(arr2[i] + " ");
		// }

		//可以逆序遍历arr1,顺序遍历arr2
		for(int i = arr1.length -1 , j = 0; i >= 0; i -- , j ++){
			arr2[j] = arr1[i];
		}
		for (int i = 0; i < arr1.length ; i ++){
			System.out.print(arr2[i] + " ");
		}


	}
}