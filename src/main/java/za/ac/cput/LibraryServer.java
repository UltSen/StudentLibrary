/*
* StudentNo:217068324
* Name: Cobain Liam Cupido
* Class Function: Establishing and Listening for a connection with the client program.
 */
package za.ac.cput;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.*;

public class LibraryServer {

    public static void main(String args[]) {
        ServerSocket s = null;

        try {
            s = new ServerSocket(5432);
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
            System.exit(0);
        }
        while (true) {
            try {
                System.out.println("Server running...Listening for connections...");
                System.out.println("Connection Established");
                Socket sl = s.accept();

                System.out.println("Connection Established");
                OutputStream slout = sl.getOutputStream();
                DataOutputStream dos = new DataOutputStream(slout);

                dos.close();
                sl.close();
                System.out.println("Connection Closed");
            } catch (IOException e) {
                System.out.println("Error" + e.getMessage());
            }
        }
    }
}
