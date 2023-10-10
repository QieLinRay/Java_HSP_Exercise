public class BubbleSort{
	public static void main(String[] args){
		// 从大到小
		int[] arr = {1, 4, 8, 61, 99, 87};
		for(int i = 0; i < arr.length; i ++){
			System.out.print(arr[i] + " ");
		}
		for(int i = 0; i < arr.length - 1; i ++){
			for (int j = i + 1; j < arr.length; j ++){
				int temp = arr[i];
				if(arr[i] < arr[j]){
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("====="+i);
			for(int k = 0; k < arr.length; k ++){
			System.out.print(arr[k] + " ");
			//System.out.println();
		}
		System.out.println();
		}

		for(int i = 0; i < arr.length; i ++){
			System.out.print(arr[i] + " ");
		}
	}
}