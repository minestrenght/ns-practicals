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
		System.out.println("Sending login info ...");
		out.println("Avinash");//<-- user name
		out.flush();//<-- send user name
		out.println("123");//<-- password
		out.flush();//<-- send password
		Scanner in = new Scanner(s.getInputStream());//<-- receiving
		System.out.println(in.nextLine());//<-- get server response
		System.out.println("Disconnecting ...");
		s.close();
		System.out.println("Disconnected ...");
    }
}
