package cat.paucasesnovescifp.sppsp.models;

import java.io.*;
import java.net.*;

public class Cliente {
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

        persona = new Persona("Joselito","Garcia");
        try {
            ip = InetAddress.getByName("127.0.0.1");
            socket = new DatagramSocket();

            baos = new ByteArrayOutputStream();
            ous = new ObjectOutputStream(baos);
            ous.writeObject(persona);
            ous.close();

            enviar = baos.toByteArray();
            paqueteEnviar = new DatagramPacket(enviar,enviar.length,ip,5555);
            socket.send(paqueteEnviar);
            socket.close();


            // Recibir
            socket = new DatagramSocket(5556);
            recibir = new byte[1024];
            paqueteRecibir = new DatagramPacket(recibir,recibir.length);
            socket.receive(paqueteRecibir);
            bais = new ByteArrayInputStream(recibir);
            ois = new ObjectInputStream(bais);
            personaNueva = (Persona) ois.readObject();
            ois.close();

            System.out.println(personaNueva);

            socket.close();


        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
