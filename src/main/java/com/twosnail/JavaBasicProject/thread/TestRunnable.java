package com.twosnail.JavaBasicProject.thread;
/**
 * <b>Description:</b></br> 
 * <b>Title:</b>360问医生后台管理
 * @company:7dosoft
 * @author: txd
 * @Date: 2015年3月8日上午9:38:12
 * @version 1.0
 */
/** 
* 实现Runnable接口的类 
* 
* @author leizhimin 2008-9-13 18:12:10 
*/ 
class Tunnable implements Runnable { 
    private String name; 

    public Tunnable(String name) { 
        this.name = name; 
    } 

    public void run() { 
        for (int i = 0; i < 5; i++) { 
            for (long k = 0; k < 100000000; k++) ; 
            System.out.println(name + ": " + i); 
        } 
    } 
}


/** 
* 测试Runnable类实现的多线程程序 
* 
* @author leizhimin 2014-9-13 18:15:02 
*/ 
public class TestRunnable { 
    public static void main(String[] args) { 
    	Tunnable ds1 = new Tunnable("阿三"); 
    	Tunnable ds2 = new Tunnable("李四"); 

        Thread t1 = new Thread(ds1); 
        Thread t2 = new Thread(ds2); 

        t1.start(); 
        t2.start(); 
    } 
}
