package com.twosnail.JavaBasicProject.reflect;
/**
 * <b>Description:</b></br> 
 * <b>Title:</b>通过一个对象获得完整的包名和类名
 * @company:7dosoft
 * @author: txd
 * @Date: 2015年3月3日下午5:02:22
 * @version 1.0
 */
public class Demo01 {

	public static void main(String[] args) {
		 Demo demo=new Demo();
		//所有类的对象其实都是Class的实例。
	     System.out.println(demo.getClass().getName());
    }
	
}

class Demo{
    
}