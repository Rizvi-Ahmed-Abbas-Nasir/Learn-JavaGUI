import java.net.MalformedURLException;
import java.net.URL;

public class URLProgram {


		
		
	
	public static void main(String args[]) throws MalformedURLException {
		URL uri = new URL("http://www.msbte.org.in");
		System.out.println("Protocal: "+uri.getProtocol());
		System.out.println("Host: "+uri.getHost());
		System.out.println("File: "+uri.getFile());
		System.out.println("Port: "+uri.getPort());
		System.out.println("External: "+uri.toExternalForm());
	}
}
