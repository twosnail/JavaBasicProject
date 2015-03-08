package com.twosnail.JavaBasicProject.tcp;
/**
 * <b>Description:</b></br> 
 * <b>Title:</b>360问医生后台管理
 * @company:7dosoft
 * @author: txd
 * @Date: 2015年3月6日下午3:48:06
 * @version 1.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//客户端指定信息来控制服务器输出

public class BeerServer1 {
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(1234); //如果端口已占用会出现异常，例如运行两次此程序第二个会有异常
		
				System.out.println("Listening....");
				Socket socket = server.accept(); //监听到了的连接，这个调用会阻塞，因此程序会挂起，直到一台客户端计算机连接到它
				InetAddress addr = socket.getInetAddress(); //得到客户端的ip地址
				System.out.println("connection made to "+addr.getHostName()+"("+addr.getHostAddress()+")");
				
				server.close();//no more connect,只向单个客户端显示消息
				
				
//				PrintStream不做什么，必须和流联系在一起
				PrintStream psstream = new PrintStream(socket.getOutputStream());
				
//		==========	与上一个不同之处 =============
				//ask for count
				psstream.print("count? ");
				BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
//				read and parse it
				String line = input.readLine();
				psstream.println(" ");
				int count = Integer.parseInt(line);
//		==========	与上一个不同之处 =============				
				for(int i =count;i>=0;i--){
					psstream.println(i+" bottles of beer on the wall");
				}
				psstream.close();
				socket.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
