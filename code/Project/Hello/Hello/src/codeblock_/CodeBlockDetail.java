package codeblock_;

public class CodeBlockDetail {
    public static void main(String[] args) {
        //父类A的静态代码块
        //父类A的静态属性
        //子类B的静态代码块
        //子类B的静态属性

        //父类A 的普通代码块
        //子类B的普通代码块//与下面的执行顺序错误
        //父类A的无参构造器
        //子类B的无参构造器
        //
        B b = new B();
        //new B();

    }
}

class A{
    static {
        System.out.println("父类A的静态代码块");
    }
    {
        System.out.println("父类A的普通代码块");
    }

    public static int n1 = getN1();

    public static int getN1() {
        System.out.println("父类A的静态属性");
        return n1;
    }

    public static void setN1(int n1) {
        A.n1 = n1;
    }

    public A() {
        System.out.println("父类A的无参构造器");
    }
}

class B extends A{
    static {
        System.out.println("子类B的静态代码块");
    }
    {
        System.out.println("子类B的普通代码块");
    }

    public static int n1 = getN1();

    public static int getN1() {
        System.out.println("子类B的静态属性");
        return n1;
    }

    public static void setN1(int n1) {
        A.n1 = n1;
    }

    public B() {
        //super();
        System.out.println("子类B的无参构造器");
    }
}
