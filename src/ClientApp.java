
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientApp {

    public static void main(String[] var0) {
        // Automatically closes resources when out of scope
        try (Socket var1 = new Socket("localhost", 12345);
                BufferedReader var2 = new BufferedReader(new InputStreamReader(var1.getInputStream(), "UTF-8"));
                PrintWriter var3 = new PrintWriter(new OutputStreamWriter(var1.getOutputStream(), "UTF-8"), true);
                BufferedReader var4 = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to server. Type 'exit' to quit.");
            System.out.println(var2.readLine()); // Welcome message from server

            String var5;
            while ((var5 = var4.readLine()) != null) {
                System.out.println("Sending request: " + var5);
                var3.println(var5); // Send the request to the server

                String var6 = var2.readLine(); // Read the server's response
                System.out.println("Server response: " + var6);

                if ("Goodbye!".equalsIgnoreCase(var6)) {
                    break;
                }
            }

        } catch (IOException var15) {
            System.out.println("Error with network connection: " + var15.getMessage());
        }
    }

}
