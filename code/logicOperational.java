public class logicOperational{
	public static void main(String[] args){
		int x = 5;
		int y = 5;
		if(x++ == 6 & ++y == 6 ){
			x = 11;
		}//x++���ȱȽϣ���������5��=6������ΪF������x����Ҫ������x=6
		System.out.println("x="+x+"y="+y);
		//x =6, y = 6

		int x1 = 5;
		int y1 = 5;
		if(x1++ == 6 && ++y1 == 6 ){
			x1 = 11;
		}
		System.out.println("x1="+x1+"y1="+y1);
		//x =6, y = 5

		int x2 = 5;
		int y2 = 5;
		if(x2++ == 5 | ++y2 == 5 ){
			x2 = 11;
		}
		System.out.println("x2="+x2+"y2="+y2);
		//x =6, y = 6xx(����)
		//x =11��x���ȱȽ�������

		int x3 = 5;
		int y3 = 5;
		if(x3++ == 5 || ++y3 == 5 ){
			x3 = 11;
		}
		System.out.println("x3="+x3+"y3="+y3);
		//x =6, y = 5xx������
		//x =11

		boolean x4 = true;
		boolean y4 = false;
		short z = 46;
		//System.out.println(z++==46);

		// if((z++==46) && (y == true)) z++;//z=46,z+=,z=47,y=true,z++ ,z=48
		// if((x==false ) || (++z==49)) z++;//��·�򣬵�һ��Ϊ�治���·������
		// System.out.println("z= "+z);//48��������ȷΪ50
		//������������y4��������y

		if((z++==46) && (y4 = true)) z++;//z=46,z+=,z=47,y=true,z++ ,z=48
		if((x4=false ) || (++z==49)) z++;//��·�򣬵�һ��Ϊ�治���·������
		System.out.println("z= "+z);//48��������ȷΪ50

		byte p = 3;
		p += 2;//�ȼ���b = (byte)(b + 2)
		p = p +2;
		p ++;//Ҳ�������͵�ת����
		//p = p + 2;




		
	}
}