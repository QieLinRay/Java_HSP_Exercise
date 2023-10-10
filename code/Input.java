import java.util.Scanner;//导入类
//1.引入Scanner对应的包
//Scanner:简单的文本扫描器，再util中
//创建Scanner对象实例
//接受用户输入
//使用相关方法
public class Input{
	public static void main(String[] args){
		Scanner myScaner = new Scanner(System.in);//new一个新的Scanner对象
		System.out.println("请输入名字");
		String name = myScaner.next();//接受用户的输入
		
	}
}
