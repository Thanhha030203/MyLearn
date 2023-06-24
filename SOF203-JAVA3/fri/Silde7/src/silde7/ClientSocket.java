/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silde7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author Admin
 */
public class ClientSocket {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        BufferedReader inFromUser =new  BufferedReader (new InputStreamReader(System.in));
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName("ThanhHa");
        byte [] senData = new byte[1024];
        byte[] recevieData = new byte[1024];
        String sentences = inFromUser.readLine();
        senData = sentences.getBytes();
        
        DatagramPacket senPacket = new DatagramPacket(senData,senData.length,IPAddress,6789);
        clientSocket.send(senPacket);
        DatagramPacket receviePacket = new DatagramPacket(recevieData,recevieData.length);
                clientSocket.receive(receviePacket);
        String modifiedSentences = new String(receviePacket.getData());
        
        System.out.println("FROM SERVER :"+ modifiedSentences);
        clientSocket.close();
    }
}
