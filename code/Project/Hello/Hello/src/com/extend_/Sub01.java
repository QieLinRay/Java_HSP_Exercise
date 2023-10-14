package com.extend_;

public class Sub01 extends Base01{
    String name ;
    public Sub01() {
        System.out.println("Sub01()...");
    }
    public Sub01(String name ) {
        super("abe");
//        this(Sub01);
//        this.name = name;
        System.out.println("Sub01()...");
    }

    public  void sayOk(){
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();

    }
}
