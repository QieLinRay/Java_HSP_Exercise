public class homework02{
	public static void main(String[] args){
		//1
		char c1 = '\n';
		char c2 = '\t';
		char c3 = '\r';
		char c4 = '1';
		char c5 = '2';
		char c6 = '3';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);


		//2
		String s1 = "��������";
		String s2 = "���μ�";
		System.out.println("s1 + s2");

		char c10 = '��';
		char c11 = 'Ů';
		System.out.println(c10 + c11);//�õ�����һ����������

		float f1 = 123.9f;
		float f2 = 110.0f;//float����Ҫ��f
		System.out.println(f1 + f2);


		//3
		String name  = "Ray";
		int age = 23;
		int score = 99;
		String gender = "felmale";//char gender = '��';
		String hobby = "reading";
		System.out.println("name" + '\t' + "age" + '\t' + "score" + '\t' + "gender" +'\t' + "hobby" + '\n' +
			name + '\t' + age + '\t' + score + '\t' + gender +'\t' + hobby);
		System.out.print("����\t����\t�ɼ�\t�Ա�\t����\n" + 
			name + '\t' + age + '\t' + score + '\t' + gender +'\t' + hobby);

		



	}
}