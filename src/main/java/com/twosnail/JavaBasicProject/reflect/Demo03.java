package com.twosnail.JavaBasicProject.reflect;
/**
 * <b>Description:</b></br> 
 * <b>Title:</b>通过Class实例化其他类的对象
 * @company:7dosoft
 * @author: txd
 * @Date: 2015年3月3日下午5:02:22
 * @version 1.0
 */

class Person{
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "["+this.name+"  "+this.age+"]";
    }
    private String name;
    private int age;
    
    //当把默认的构造函数取消，定义一个有参的构造函数，会报错
    /*public Person(String name, int age) {
        this.age=age;
        this.name=name;
    }*/
    
}
 
public class Demo03{
    public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("com.twosnail.JavaBasicProject.reflect.Person");
        }catch (Exception e) {
            e.printStackTrace();
        }
        Person per=null;
        try {
            per=(Person)demo.newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        per.setName("Rollen");
        per.setAge(20);
        System.out.println(per);
    }
}
