public class Scope{
	public static void main(String[] args){
		String str = "a";
		String str1 = str;
		System.out.println(str + " " + str1);
		str1 = "b";
		System.out.println(str + " " + str1);
		int n1 = 1;
		int n2 = n1;
		System.out.println(n1 + " " + n2);
		n2 = 2;
		System.out.println(n1 + " " + n2);
		int[] arr = {1,2,3};
		int[] arr2 = arr;
		for(int i = 0 ; i < 3; i ++){
			System.out.print(arr[i] + " ");
		}
		arr2[0] = 10;
		for(int i = 0 ; i < 3; i ++){
			System.out.print(arr[i] + " ");
		}



		person p = new person();
		String name = p.name;
		int age = p.age;
		System.out.println(p.name +" " + p.age);
		System.out.println(name +" " + age);
		
		//p.name(p);
		age = 20;
		name = "alice";
		System.out.println(p.name +" " + p.age);
		System.out.println(name +" " + age);
	}
}

class person{
	String name = "jack";
	int age = 10;

	public void name(person p){
		p.name = "alice";
		p.age = 20;
	}

	public void getName(){

	}
}