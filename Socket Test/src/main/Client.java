package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public Client() throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		String serverAddress = scanner.next();
		scanner.close();
		
		Socket s = new Socket(serverAddress, 9090);
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String answer = input.readLine();
		System.out.println(answer);
		s.close();
		System.exit(0);
		
	}
	
	public static void main(String[] args) throws IOException {
		new Client();
	}
	
}
