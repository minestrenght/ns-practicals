import java.net.ServerSocket;
import java.net.Socket;

import java.io.PrintWriter;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
		System.out.println("Starting ...");
		// create server with ServerSocket object
		ServerSocket s = new ServerSocket(5432);//<-- register port no
		System.out.println("Started ...");
		System.out.println("Waiting for client ...");
		Socket c = s.accept();//<-- only when client makes request
		System.out.println("Connected ...");
		System.out.println("Receiving login info ...");
		Scanner in = new Scanner(c.getInputStream());//<-- receiving
		String user = in.nextLine();//<-- get user name
		String pass = in.nextLine();//<-- get password
		PrintWriter out = new PrintWriter(c.getOutputStream());//<-- sending
		if("Avinash".equals(user) && "123".equals(pass)) {
			out.println("Success: Access Granted");
		} else {
			out.println("Error: Access Denied !");
		}
		out.flush();//<-- send response
		System.out.println("Disconnecting ...");
		System.out.println("Disconnected ...");
		s.close();
		System.out.println("Shutting down ...");
    }
}
