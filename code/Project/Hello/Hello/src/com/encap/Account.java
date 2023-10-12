package com.encap;

public class Account {
    private String name;
    private double revenue;
    private String password;

    public Account() {
    }

    public Account(String name, double revenue, String password) {
       this.setName(name);
       this.setPassword(password);
       this.setRevenue(revenue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2 && name.length() <= 4) {
            this.name = name;
        }else {
            System.out.println("名字长度不对，设置默认值为张三");
            this.name = "张三";
        }
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
     if(revenue > 20){
         this.revenue = revenue;
     }
     else {
         System.out.println("余额不足，请重新输入");
     }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6){
            this.password = password;
        }else {
            System.out.println("密码长度需要为6位，默认设置位111111");
            this.password = "111111";
        }
    }


}
