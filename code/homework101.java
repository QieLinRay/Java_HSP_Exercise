public class homework101{
	public static void main(String[] args){
		// 作业
		System.out.println(10/3);//3
		System.out.println(10/5);//2
		System.out.println(10%2);//0
		System.out.println(-10.5%3);//-1.5,-10.5-(-10)/3*3 = -1.5,接近1.5的数
		System.out.println(-10.4%3);//-1.5,-10.5-(-10)/3*3 = -1.5,接近1.5的数
		//注意有小数参与的运算，最后得到的结果是近似值
		//a % b,当a 是小数时，公式 = a - (int)a/b *b

		int i = 66;
		System.out.println(++i+i);//67+67=134
		//先自增，i=67

		String str2 = "18.8";
		double d1 = Double.parseDouble(str2);//注意字符串能够转成double,这里的包装类要是Double

		//将char类型转成String
		char ch = 'a';
		String str1 = ch +"";


	}
}