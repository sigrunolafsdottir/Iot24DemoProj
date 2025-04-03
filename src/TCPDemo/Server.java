package TCPDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    int port = 12345;

    public Server() throws IOException {

        try(ServerSocket ss = new ServerSocket(port);
            Socket s = ss.accept();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));){

            String temp;
            while((temp = br.readLine()) != null){
                System.out.println(temp);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        new Server();
    }

}
