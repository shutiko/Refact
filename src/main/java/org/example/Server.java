package org.example;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    //String host = "127.0.0.1\n";
    int port = 9999;
    ServerSocket serverSocket;


    public ServerSocket serverStart() throws IOException {
        this.serverSocket = new ServerSocket(port);
        return serverSocket;
    }

    //final Socket socket = serverStart().accept();
    //final BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    //final BufferedOutputStream out = new BufferedOutputStream(socket.getOutputStream());

}
