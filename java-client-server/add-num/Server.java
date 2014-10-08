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
		Socket c = s.accept();//<-- proceed only when client makes request
		System.out.println("Connected ...");
		System.out.println("Receiving numbers ...");
		Scanner in = new Scanner(c.getInputStream());//<-- receiving
		int n1 = in.nextInt();//<-- get first number
		int n2 = in.nextInt();//<-- get second number
		PrintWriter out = new PrintWriter(c.getOutputStream());//<-- sending
		out.printf("%d + %d = %d", n1, n2, n1 + n2);
		out.flush();//<-- send response
		System.out.println("Disconnecting ...");
		System.out.println("Disconnected ...");
		s.close();
		System.out.println("Shutting down ...");
    }
}
