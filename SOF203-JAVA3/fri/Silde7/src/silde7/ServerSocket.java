/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silde7;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author Admin
 */
public class ServerSocket {
    public static void main(String[] args) throws SocketException, IOException {
    DatagramSocket serverSocket = new DatagramSocket(9999);
    byte[] recevieData = new byte[1024];
    byte [] sendData = new byte[1024];
    while(true){ 
    DatagramPacket receviePacket = new DatagramPacket(recevieData, recevieData.length);
    serverSocket.receive(receviePacket);
    String sentences = new String(receviePacket.getData());
        InetAddress IPAdress = receviePacket.getAddress();
        int port = receviePacket.getPort();
        String capitalizedSentences = sentences.toUpperCase();
                sendData = capitalizedSentences.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData,sendData.length,IPAdress,port);
        serverSocket.send(sendPacket);
}
    }
}
