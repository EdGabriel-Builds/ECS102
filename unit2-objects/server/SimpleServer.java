
import java.util.*;
import java.io.*;
import java.net.*;


public class SimpleServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter out;
    private Scanner in;

    public SimpleServer(int port) throws Exception{
        serverSocket = new ServerSocket(port);

    }
    public void acceptClient() throws Exception {
        socket = serverSocket.accept();
        in = new Scanner(socket.getInputStream());
        out = new PrintWriter(socket.getOutputStream());
    }
    public String receiveMessage(){
        return in.nextLine();

    }
    public void sendMessage(String msg){
        out.println(msg);
    }
    public void close() throws Exception{
        serverSocket.close();
        socket.close();
        in.close();
        out.close();
    }
    public static void main(String[] args) throws Exception{
        SimpleServer smp = new SimpleServer(9090);
        smp.acceptClient();
        Scanner input=new Scanner(System.in);
        while(true){
            String message=input.nextLine();
            smp.sendMessage(message);
           // smp.sendMessage("hello");
            String msg=smp.receiveMessage();
            System.out.print("Client  "+msg);
            if(msg.equals("stop")){
                 break;
            }

        }
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
