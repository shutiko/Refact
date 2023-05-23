package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
  public static void main(String[] args) {

    final var server = new Server();
    ExecutorService ex = Executors.newFixedThreadPool(64);
    try (
            final var serverSocket = server.serverStart()) {
      while (true) {

        //
        try (
                final var socket = serverSocket.accept();
                //final var in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //final var out = new BufferedOutputStream(socket.getOutputStream())
        )
        //
        {
          socket.setSoTimeout(3000);
          ex.execute(new Handler(socket));
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}


