import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {
    private Socket socket;
    private PrintWriter out;
    private Scanner in;

    public SimpleClient(String ip, int port) throws Exception {
        socket = new Socket(ip, port);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new Scanner(socket.getInputStream());
    }

    public void sendMessage(String msg) {
        out.println(msg);
        out.flush();
    }

    public String receiveMessage() {
        if (in.hasNextLine()) {
            return in.nextLine();
        }
        return null;
    }

    public void close() throws Exception {
        out.close();
        in.close();
        socket.close();
    }

    public static void main(String[] args) throws Exception {
        SimpleClient smc = new SimpleClient("127.0.0.1", 9090);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter message:");

        while (true) {
            String message = input.nextLine();
            smc.sendMessage(message);
            
            String response = smc.receiveMessage();
            System.out.println("Server: " + response);

            if (message.equals("stop")) {
                break;
            }
        }

        smc.close();
        input.close();
    }
}

// package Server;

// import java.net.*;
// import java.io.*;
// import java.util.*;

// public class SimpleClient2 {
//     private Socket socket;
//     private PrintWriter out;
//     private Scanner in;

//     public SimpleClient2(String ip, int port) throws Exception{
//         socket=new Socket(ip, port);
//         out=new PrintWriter(socket.getOutputStream(), true);
//         in= new Scanner(socket.getInputStream());
//     }
//     public void sendMessage(String message){

//         out.println(message);
//         out.flush();
//     }
//     public String receiveMessage(){
//         return in.nextLine();
//     }
//     public void close() throws Exception{
//         socket.close();
//         out.close();
//         in.close();
//     }
//     public static void main(String[] args){
//         SimpleClient2 simpleClient = new SimpleClient2("127.0.0.1",9090 );
//         Scanner input = new Scanner(System.in);
//         while(true){
//             String message=input.nextLine();
//             simpleClient.sendMessage(message);
//             String serverR= simpleClient.receiveMessage();
//             System.out.println("Server : "+serverR);
//             if(serverR.equals("stop")){
//                 break;
//             }
//         }
//         simpleClient.close();



    
// }