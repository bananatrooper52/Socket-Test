package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public String serverName = "Elijah's computer";

	public Server() throws IOException {

		ServerSocket listener = new ServerSocket(9090);

		try {
			while (true) {
				Socket socket = listener.accept();
				try {
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					out.println("Message recieved from " + serverName + "!");
				} finally {
					socket.close();
				}
			}
		} finally {
			listener.close();
		}

	}
	
	public static void main(String[] args) throws IOException {
		new Server();
	}

}
