import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    private static int port = 8900;
    private static String ip = "localhost";

    public static void main(String[] args) {
        try(Socket clientSocket = new Socket(ip, port);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));){

            out.println("Hitray");

            String serverAnswer = in.readLine();

            System.out.println("Answer in server: " + serverAnswer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
