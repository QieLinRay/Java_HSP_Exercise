public class TernaryOperator{
	public static void main(String[] args){
		int a = 10;
		int b = 99;
		int result = a > b ? a++ : b--;
		System.out.println(result);
		//因为是后--，所以先返回b，b再--,前面--b，返回98

		//细节
		//表达式1和表达式2要为接受变量的类型(或者自动转换或者强制转换)

		//案例：实现三个数的最大值
		//自己实现
		int a1 = 99;
		int b1 = 23;
		int c1 = 31;
		int max = a1 > b1 ? a1 : b1;
		int max1 = max > c1 ? max : c1;
		System.out.println("max1=" + max1);

		//思路，求得a1,a2中最大的数max1，然后再求出max1与c1比较

		//使用一条语句:6666
		int max2 = (a1 > b1 ? a1 : b1) > c1 ? (a1 > b1 ? a1 : b1) : c1;



	}}