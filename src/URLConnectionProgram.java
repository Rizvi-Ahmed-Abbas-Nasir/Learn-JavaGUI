import java.net.MalformedURLException;
import  java.net.*;
import java.util.Scanner;

public class URLConnectionProgram {

	
	public static void main(String args[]) throws MalformedURLException{
		System.out.println("Enter URL");
		Scanner scnScanner = new Scanner(System.in);
		String nameString = scnScanner.next();
		URL url = new URL(nameString);
		URLConnection urlConnectoin;
		try {
			urlConnectoin = url.openConnection();
			System.out.println("Date " +urlConnectoin.getDate());
			System.out.println("Length " +urlConnectoin.getContentLength());
			System.out.println("Type " +urlConnectoin.getContentType());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
