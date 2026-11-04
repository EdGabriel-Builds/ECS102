
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter out;
    private Scanner in;

    public SimpleServer(int port) throws Exception {
        serverSocket = new ServerSocket(port);
    }

    public void acceptClient() throws Exception {
        socket = serverSocket.accept();
        in = new Scanner(socket.getInputStream());
        out = new PrintWriter(socket.getOutputStream(), true);
    }

    public String receiveMessage() {
        if (in.hasNextLine()) {
            return in.nextLine();
        }
        return null;
    }

    public void sendMessage(String msg) {
        out.println(msg);
    }

    public void close() throws Exception {
        if (out != null) out.close();
        if (in != null) in.close();
        if (socket != null) socket.close();
        if (serverSocket != null) serverSocket.close();
    }

    public static void main(String[] args) throws Exception {
        SimpleServer smp = new SimpleServer(9090);
        smp.acceptClient();
        
        Scanner serverInput = new Scanner(System.in);

        while (true) {
            String msg = smp.receiveMessage();
            if (msg == null || msg.equals("stop")) {
                break;
            }
            System.out.println("Client: " + msg);

            System.out.print("Server reply: ");
            String reply = serverInput.nextLine();

            smp.sendMessage(reply);
        }

        serverInput.close();
        smp.close();
    }
}

// // package Server;

// import java.util.*;
// import java.io.*;
// import java.net.*;

// public class SimpleServer {
//     private ServerSocket serverSocket;
//     private Socket socket;
//     private PrintWriter out;
//     private Scanner in;


//     public SimpleServer(int port) throws Exception {
//         serverSocket = new ServerSocket(port);
//     }

//     public void acceptClient() throws Exception {
//         socket = serverSocket.accept();
//         in = new Scanner(socket.getInputStream());
//         out = new PrintWriter(socket.getOutputStream());
//     }

//     public String receiveMessage() {
//         return in.nextLine();
//     }

//     public void sendMessage(String msg) {
//         out.println(msg);
//     }

//     public void close() throws Exception {
//         serverSocket.close();
//         in.close();
//     }

//     public static void main(String[] args) throws Exception {
//         SimpleServer smp = new SimpleServer(9090);
//         smp.acceptClient();

//         while (true) {
//             smp.sendMessage("Hello");
//             String msg = smp.receiveMessage();
//             System.out.print("Reply " + msg)

//             if (msg.equals("stop")) {
                
//             }
//         }
//     }


// }
