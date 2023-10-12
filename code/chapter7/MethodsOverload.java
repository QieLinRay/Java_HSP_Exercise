public class MethodsOverload{
	public static void main(String[] args){
		Method method = new Method();
		method.m(4);
		method.m(2,3);
		method.m("hello");
		double n = method.max(1,2,3);
		System.out.println(n);
	}
}
class Method{
	public void m(int n){
		System.out.println(n*n);
	}
	public void m(int n1, int n2){
		System.out.println(n1 * n2);
	}
	public void m(String s){
		System.out.println(s);
	}

	public int max(int n1, int n2){
		return n1 > n2 ? n1 : n2;
	}

	public double max(double d1, double d2){
		return d1 > d2 ? d1 : d2;
	}

	public double max(double d1, double d2, double d3){
		double max1 = d1 > d2 ? d1 : d2;
		return max1 > d3 ? max1 : d3;
	}
}