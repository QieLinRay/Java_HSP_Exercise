public class TernaryOperator{
	public static void main(String[] args){
		int a = 10;
		int b = 99;
		int result = a > b ? a++ : b--;
		System.out.println(result);
		//��Ϊ�Ǻ�--�������ȷ���b��b��--,ǰ��--b������98

		//ϸ��
		//���ʽ1�ͱ��ʽ2ҪΪ���ܱ���������(�����Զ�ת������ǿ��ת��)

		//������ʵ�������������ֵ
		//�Լ�ʵ��
		int a1 = 99;
		int b1 = 23;
		int c1 = 31;
		int max = a1 > b1 ? a1 : b1;
		int max1 = max > c1 ? max : c1;
		System.out.println("max1=" + max1);

		//˼·�����a1,a2��������max1��Ȼ�������max1��c1�Ƚ�

		//ʹ��һ�����:6666
		int max2 = (a1 > b1 ? a1 : b1) > c1 ? (a1 > b1 ? a1 : b1) : c1;



	}}