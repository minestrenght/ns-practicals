import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
		System.out.println("Connecting ...");
		// create client with Socket object
		Socket s = new Socket("127.0.0.1", 5432);//<-- same as server port no.
		System.out.println("Connected ...");
		System.out.println("Disconnecting ...");
		s.close();
		System.out.println("Disconnected ...");
    }
}
