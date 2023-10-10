public class Object01{
	public static void main(String[] args){
		//单独变量解决，不利于数据管理
		String cat1Name = "XiaoBai";
		int cat1Age = 3;
		String cat1Color = "White";

		String cat2Nama = "XiaoHua";
		int cat2Age = 100;
		String cat2Color = "colorful";

		//数组-----数据类型体现不出来
		//只能通过下标获取信息，造成变量名字和内容的对应关系不明确，不能体现猫的行为。

		String[] cat1 = {"xiaobia","3","white"};//cat1[1]失去了变量名和内容的关系

		//不利于数据管理
		//Java的设计者，根本原因就是现有的技术不能完美地解决新的需求。

		//创建一直猫对象
		//new Cat()创建一个猫对象，并赋值给cat1;

		Cat cat1 = new Cat();
		cat1.name = "xiaobai";
		cat1.age = 3;
		cat1.color = "white";

		Cat cat2 = new Cat();
		cat2.name = "xiaohua";
		cat2.age = 100;
		cat2.color = "colorful";

		//cat1就是一个对象
	}
}

//使用面向对象OOP

public Cat{
	String name;
	int age;
	String color;

	//行为
}