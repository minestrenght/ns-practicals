import java.net.Socket;

import java.io.PrintWriter;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
		System.out.println("Connecting ...");
		// create client with Socket object
		Socket s = new Socket("127.0.0.1", 5432);//<-- same as server port no.
		System.out.println("Connected ...");
		PrintWriter out = new PrintWriter(s.getOutputStream());//<-- sending
		System.out.println("Sending numbers ...");
		out.println(34);//<-- first number
		out.flush();//<-- send first number
		out.println(3);//<-- second number
		out.flush();//<-- send second number
		Scanner in = new Scanner(s.getInputStream());//<-- receiving
		System.out.println(in.nextLine());//<-- get server response
		System.out.println("Disconnecting ...");
		s.close();
		System.out.println("Disconnected ...");
    }
}
