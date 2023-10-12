public class Constractor{
	public static void main(String[] args){
		Person p = new Person("jack", 18);
		System.out.println(p.name);
		dog d = new dog();
	}
}
class dog{

}

class Person{
	String name;
	int age;
	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
}