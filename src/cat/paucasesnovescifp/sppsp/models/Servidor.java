package cat.paucasesnovescifp.sppsp.models;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Servidor {

    public static void main(String[] args) {

        DatagramSocket socket;
        DatagramPacket paqueteEnviar;
        DatagramPacket paqueteRecibir;
        InetAddress ip;
        Persona persona;
        Persona personaNueva;
        ByteArrayOutputStream baos;
        ByteArrayInputStream bais;
        ObjectOutputStream ous;
        ObjectInputStream ois;
        byte[] enviar;
        byte[] recibir;


        try {
            socket = new DatagramSocket(5555);
            recibir = new byte[1024];
            paqueteRecibir = new DatagramPacket(recibir,recibir.length);
            socket.receive(paqueteRecibir);
            bais = new ByteArrayInputStream(recibir);
            ois = new ObjectInputStream(bais);
            personaNueva = (Persona) ois.readObject();
            ois.close();

            System.out.println(personaNueva);

            personaNueva.setEdat(23);
            personaNueva.setCarrer("Calle carrer");
            personaNueva.setMunicipi("Inca");
            personaNueva.setCodiPostal(9600);
            personaNueva.setPais("Espania");
            personaNueva.setTelefon(637043131);
            personaNueva.setEmail("Joselito@hotmail.com");

            ip = InetAddress.getByName("127.0.0.1");
            socket = new DatagramSocket();

            baos = new ByteArrayOutputStream();
            ous = new ObjectOutputStream(baos);
            ous.writeObject(personaNueva);
            ous.close();

            enviar = baos.toByteArray();
            paqueteEnviar = new DatagramPacket(enviar,enviar.length,ip,5556);
            socket.send(paqueteEnviar);
            socket.close();


        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }

}
