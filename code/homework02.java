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
		String s1 = "三国演义";
		String s2 = "西游记";
		System.out.println("s1 + s2");

		char c10 = '男';
		char c11 = '女';
		System.out.println(c10 + c11);//得到的是一个整数！！

		float f1 = 123.9f;
		float f2 = 110.0f;//float后面要加f
		System.out.println(f1 + f2);


		//3
		String name  = "Ray";
		int age = 23;
		int score = 99;
		String gender = "felmale";//char gender = '男';
		String hobby = "reading";
		System.out.println("name" + '\t' + "age" + '\t' + "score" + '\t' + "gender" +'\t' + "hobby" + '\n' +
			name + '\t' + age + '\t' + score + '\t' + gender +'\t' + hobby);
		System.out.print("姓名\t年龄\t成绩\t性别\t爱好\n" + 
			name + '\t' + age + '\t' + score + '\t' + gender +'\t' + hobby);

		



	}
}