package com.twosnail.JavaBasicProject.reflect;
/**
 * <b>Description:</b></br> 
 * <b>Title:</b>实例化Class类对象
 * @company:7dosoft
 * @author: txd
 * @Date: 2015年3月3日下午5:02:22
 * @version 1.0
 */
public class Demo02 {

	public static void main(String[] args) {
		Class<?> demo1=null;
        Class<?> demo2=null;
        Class<?> demo3=null;
		
        //三种方式
        try {
			demo1 = Class.forName( "com.twosnail.JavaBasicProject.reflect.Demo" ) ;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}        
        
        demo2 = Demo.class ;
        demo3 = new Demo().getClass() ;
        
        System.out.println("类名称   "+demo1.getName());
        System.out.println("类名称   "+demo2.getName());
        System.out.println("类名称   "+demo3.getName());
        
        
    }
	
}
