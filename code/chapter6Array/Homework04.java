public class Homework04{
	public static void main(String[] args){
		int[] arr = {1,34,56,58,88};
		int number = 622;
		// 如果添加的元素够大，定位应该在最后，index，找到位置以后就要break
		int[] arrNew = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i ++){
			arrNew[i] = arr[i];
		}
		for(int i = 0; i < arrNew.length - 2; i++){
			if(arrNew[i] < number && arrNew[i + 1] >= number){
				for(int j = arrNew.length - 1; j > i + 1; j--){
					arrNew[j] = arrNew[j - 1];		
				}
				arrNew[i + 1] = number;
			}		
		}
		arr = arrNew;

		for(int i = 0 ; i < arr.length; i ++){
			System.out.print(arr[i]+" ");
		}
		
	}
}