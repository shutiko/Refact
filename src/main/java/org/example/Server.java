package org.example;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

public class Server {
    //String host = "127.0.0.1\n";
    int port = 9999;
    ServerSocket serverSocket;

    Socket socket;


    public ServerSocket serverStart() throws IOException {
        this.serverSocket = new ServerSocket(port);
        return serverSocket;
    }

    public void handler () {

    }

}
