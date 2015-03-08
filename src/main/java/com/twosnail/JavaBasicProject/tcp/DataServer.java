package com.twosnail.JavaBasicProject.tcp;
/**
 * <b>Description:</b></br> 
 * <b>Title:</b>360问医生后台管理
 * @company:7dosoft
 * @author: txd
 * @Date: 2015年3月6日下午3:59:45
 * @version 1.0
 */
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//一个特定的java服务器端程序能用专门的流传送输入的数据或者对象
public class DataServer {
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(1234); //如果端口已占用会出现异常，例如运行两次此程序第二个会有异常
		
				System.out.println("Listening....");
				Socket socket = server.accept(); //监听到了的连接，这个调用会阻塞，因此程序会挂起，直到一台客户端计算机连接到它
				
				DataOutputStream dsstream = new DataOutputStream(socket.getOutputStream());
				dsstream.writeFloat(3.14159265f);
				dsstream.close();
				socket.close(); 
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
