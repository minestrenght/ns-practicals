import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
		System.out.println("Starting ...");
		// create server with ServerSocket object
		ServerSocket s = new ServerSocket(5432);//<-- register port no
		System.out.println("Started ...");
		System.out.println("Waiting for client ...");
		Socket c = s.accept();//<-- only when client makes request
		System.out.println("Connected ...");
		System.out.println("Disconnecting ...");
		c.close();
		System.out.println("Disconnected ...");
		s.close();
		System.out.println("Shutting down ...");
    }
}
