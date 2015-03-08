package com.twosnail.JavaBasicProject.reflect;

import java.lang.reflect.Constructor;

/**
 * <b>Description:</b></br> 
 * <b>Title:</b>通过Class实例化其他类的对象
 * @company:7dosoft
 * @author: txd
 * @Date: 2015年3月3日下午5:02:22
 * @version 1.0
 */

class Person04{
     
	public Person04() {
        
    }
    public Person04(String name){
        this.name=name;
    }
    public Person04(int age){
        this.age=age;
    }
    public Person04(String name, int age) {
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return "["+this.name+"  "+this.age+"]";
    }
    private String name;
    private int age;
    
}
 
public class Demo04{
	public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("com.twosnail.JavaBasicProject.reflect.Person04");
        }catch (Exception e) {
            e.printStackTrace();
        }
        Person04 per1=null;
        Person04 per2=null;
        Person04 per3=null;
        Person04 per4=null;
        //取得全部的构造函数
        Constructor<?>[] cons=demo.getConstructors() ;
        try{
            per1=(Person04)cons[0].newInstance();
            per2=(Person04)cons[1].newInstance("Rollen");
            per3=(Person04)cons[2].newInstance(20);
            per4=(Person04)cons[3].newInstance("Rollen",20);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);
    }
}
