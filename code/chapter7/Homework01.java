public class Homework01{
	public static void main(String[] args){
		double[] arr = {};
		// A01 a = new A01();
		// System.out.print(a.max(arr));
		A02 a = new A02();
		if(a.max(arr) != null){
			System.out.print(a.max(arr));
		}else{
			System.out.println("��������");
		}


	}
}

//�Լ�д�� û�п��Ǵ���Ľ�׳�ԣ����arrΪ����ô�죬���Ҳ�û��˵����Ҫ�ɱ��������Ҫ�������鲻Ϊ��
class A01{
	public double max(double... arr){
		double maxNum = arr[0];
		for(int i = 1; i < arr.length; i ++){
			if(arr[i] > maxNum){
				maxNum = arr[i];
			}
		}
		return maxNum;
	}
}

class A02{
	public Double max(double[] arr){
		if(arr != null && arr.length != 0){
			double maxNum = arr[0];
			for(int i = 1; i < arr.length; i ++){
				if(arr[i] > maxNum){
					maxNum = arr[i];
				}
			}
		return maxNum;

		}
		else{
			return null;
		}

	}
}
