public class TestPerson{
	public static void main(String[] args){
		person p1 = new person("jack", 18);
		person p2 = new person("jack", 18);
		System.out.print(p1.testEqual(p2));

	}
}

class person{
	String name;
	int age;
	person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public boolean testEqual(person p){
		// if(this.name == p.name && this.age == p.age){
		// 	return true;
		// }else{
		// 	return false;
		// }

		return this.name == p.name && this.age == p.age;

	}
}