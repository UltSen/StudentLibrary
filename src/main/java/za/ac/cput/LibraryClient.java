package za.ac.cput;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.*;

/*
* StudentNo:217068324
* Name: Cobain Liam Cupido
* Class Function: 
*/

public class LibraryClient {
    public static void main(String args[]) {
        try {
            Socket sl = new Socket("192.168.18.35", 5432);
            System.out.println("Connection established at port 5432");

            //InputStream is = new sl.getInputStream();

           // DataInputStream dis = new DataInputStream(is);
           // System.out.println("Getting Data");
            
            
           // dis.close();
            sl.close();
            System.out.println("Connection Closed");
        } catch (ConnectException connExcep) {
            System.out.println("Error" + connExcep.getMessage());
        } catch (IOException ioExcep) {
            System.out.println("Error" + ioExcep.getMessage());
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
