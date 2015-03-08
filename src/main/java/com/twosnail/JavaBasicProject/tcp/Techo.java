package com.twosnail.JavaBasicProject.tcp;
/**
 * <b>Description:</b></br> 
 * <b>Title:</b>360问医生后台管理
 * @company:7dosoft
 * @author: txd
 * @Date: 2015年3月6日下午3:37:41
 * @version 1.0
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//简单化的服务器端程序，用到ServerSocket类，不做任何事，只是在碰到有连接的时候停顿3秒
public class Techo {
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(8132); //如果端口已占用会出现异常，例如运行两次此程序第二个会有异常
			while(true){
				System.out.println("Listening....");
				Socket socket = server.accept(); //监听到了的连接，这个调用会阻塞，因此程序会挂起，直到一台客户端计算机连接到它
				InetAddress addr = socket.getInetAddress(); //得到客户端的ip地址
				System.out.println("connection made to "+addr.getHostName()+"("+addr.getHostAddress()+")");
				
				pause(3000);
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void pause(int i) {

		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
