/**
 * 
 * 
 * ÑÝÊ¾ËãÊõÔËËã·û
*/

public class ArithmeticOperator{
	public static void main(String[] args){
		// ³ý·¨µÄÊ¹ÓÃ
		System.out.println(10 / 4);// ´ÓÊýÑ§½Ç¶ÈÀ´¿´ÊÇ2.5£¬µ«ÊÇÇ°ºó¶¼ÊÇÕûÊý£¬javaÖÐÎª2
		System.out.println(10.0 / 4);// 2.5
		double d = 10 / 4;
		System.out.println(d); // ÕûÊýµÄ2¸³Öµ¸ødouble
		System.out.println(); // ÕûÊýµÄ2¸³Öµ¸ødouble

		//È¡Ä£,·ûºÅÓë±»³ýÊý±£³ÖÒ»ÖÂ,a % b = a - a/b*b
		//ÔÚ%µÄ±¾ÖÊ£¬a % b = a - a/b*b,-10 % 3 = -10 - (-10)/3*3=-10 + 9 = -1
		//10 % -3 = 10 - 10/(-3) * (-3) = 10 -(-3)*(-3) = 10 - 9 = 1
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);//1
		System.out.println(-10 % -3);//-1
		// -10 % -3 = -10 - (-10)/(-3)*(-3) = -10 - 3 *(-3) = -10 + 9 = -1

		//++,Èç¹û×÷Îª¶ÀÁ¢Óï¾äÊ¹ÓÃ£¬Ç°++ºÍºó++µÈ¼Û
		int i = 10;
		i++;// i = i + 1;
		System.out.println(i);//11
		++i;
		System.out.println(i);//12

		/*
		×÷Îª±í´ïÊ½Ê¹ÓÃ
		Ç°++£º++i ÏÈ×ÔÔöºó¸³Öµ
		ºó++£ºi++ÏÈ¸³Öµºó×ÔÔö
		*/
		int j = 8;
		int k = ++ j;//j = j + 1, k = j
		System.out.println("k=" + k + "j= " + j);//Á½¸ö¶¼µÈÓÚ9
		int j1 = 8;
		int k1 = j ++;// k = j, j += 1
		System.out.println("k1=" + k1 + "j1= " + j1);//k=8,j=9

		/*
		--
		*/

		int a = 1;
		a = a++;//¹æÔò£¬Ê¹ÓÃÁÙÊ±±äÁ¿(1)temp = a, (2)a=a+1,(3)a = temp
		System.out.println(a);//1

		int a1 = 1;
		a1 = ++ a1;//2
		System.out.println(a1);//¹æÔò£¬Ê¹ÓÃÁÙÊ±±äÁ¿(2)temp = a, (1)a=a+1,(3)a = temp

		//²âÊÔ´úÂë
		int i1 = 10;
		int i2 = 20;
		int b = i1 ++;
		System.out.println(b);//10
		System.out.println(i1);//11
		b = --i2;
		System.out.println(b);//19
		System.out.println(i2);//19

		//
		int days = 59;
		int weeks =days / 7;
		int leftDay = days % 7;

		//System.out.println(weeks+"weeks and "+ day +"day");

		//¿¼ÂÇÊýÑ§¹«Ê½ºÍjavaÓïÑÔµÄÌØÐÔ
		double ini = 234.5;
		double result = 5/9 * (1135 -100);
		System.out.println(result);//Êä³öµÄÓÀÔ¶ÊÇ0£¬ÒòÎª5/9ÓÀÔ¶ÊÇ0
		//ÕýÈ·Ð´·¨
		double result1 = 5.0/9 * (ini -100);
		System.out.println(result1);

		








	}
}