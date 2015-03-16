/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dauchy
 */
public class ClientCalculette {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Socket conn = null;

		try {
			conn = new Socket("localhost", 5000);
			System.out.println("Client: Connection established");
			DataOutputStream out = new DataOutputStream(conn.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			System.out.println(in.readLine());
			out.writeBytes("coucou");
			System.out.println(in.readLine());
			/*if(in.readLine().equals("220")){
            out.writeBytes("toto\n");
            System.out.println("Message sent");
            }
            if(in.readLine().equals("231")){
            out.writeBytes("toto\n");
            System.out.println("Message sent");
            }*/
			conn.close();
		} catch (UnknownHostException ex) {
			Logger.getLogger(ClientCalculette.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(ClientCalculette.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
