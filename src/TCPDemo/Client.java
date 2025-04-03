package TCPDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    int port = 12345;

    public Client() throws IOException {
        try(Socket s = new Socket("localhost", port);
            PrintWriter out = new PrintWriter(s.getOutputStream(), true)){

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            String temp;
            while((temp = br.readLine()) != null){
                out.println(temp);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Client c = new Client();
    }
}
