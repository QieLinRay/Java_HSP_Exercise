public class homework101{
	public static void main(String[] args){
		// ��ҵ
		System.out.println(10/3);//3
		System.out.println(10/5);//2
		System.out.println(10%2);//0
		System.out.println(-10.5%3);//-1.5,-10.5-(-10)/3*3 = -1.5,�ӽ�1.5����
		System.out.println(-10.4%3);//-1.5,-10.5-(-10)/3*3 = -1.5,�ӽ�1.5����
		//ע����С����������㣬���õ��Ľ���ǽ���ֵ
		//a % b,��a ��С��ʱ����ʽ = a - (int)a/b *b

		int i = 66;
		System.out.println(++i+i);//67+67=134
		//��������i=67

		String str2 = "18.8";
		double d1 = Double.parseDouble(str2);//ע���ַ����ܹ�ת��double,����İ�װ��Ҫ��Double

		//��char����ת��String
		char ch = 'a';
		String str1 = ch +"";


	}
}