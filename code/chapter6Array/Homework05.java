public class Homework05{
	public static void main(String[] args){
		int[] arr = new int[10];
		for(int i = 0; i < 10; i ++){
			arr[i] = (int)(Math.random()*100) + 1;
		}
		int sum = 0;
		System.out.println("顺序打印");
		for(int i = 0; i < 10; i ++){
			System.out.print(arr[i]+ " ");
			sum += arr[i];
		}
		double avg = sum/10.0;
		System.out.println("平均数"+avg);
		System.out.println("逆序打印");
		for(int i = arr.length - 1; i >= 0; i--){
			System.out.print(arr[i]+" ");
		}
		int flag = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 8){
				System.out.println("有数字8");
				flag = 1;
				break;
			}
		}
		if(flag == 0){
			System.out.println("没有数字8");
		}
		int index = 0;
		for(int i = 0; i < arr.length; i ++){
			if(arr[i] > arr[index]){
				index = i;
			}
		}
		System.out.println("index = " + index);
		System.out.println("MaxNumber= " + arr[index]);

	}
}