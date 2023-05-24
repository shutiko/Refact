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
    final ServerSocket serverSocket;
    try {
      serverSocket = server.serverStart();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    while (true) {
        final Socket socket;
        try {
          socket = serverSocket.accept();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
        ex.execute(new Handler(socket));
      }
  }
}


