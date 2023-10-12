public class ObjTest{
	public static void main(String[] args){
		person p = new person();
		System.out.print("first p.age" + p.age);

		change c = new change();
		c.test(p);
		System.out.print("\nafter p.age="+p.age);


	}
}

class person{
	int age = 19;s
}

class change{
	public void test(person p){
		p.age = 999;
		p = null;

	}
}
