package ru.leshavasya.PetClinic;

/**
 * Created by Vasyamfx on 06.02.2016.
 */
public class Clinic {
    public Clinic(final int clientCount) {
        this.clients = new Client[clientCount];
    }

    /**
     * TODO Map, HashMap, ArrayList, LinkedList??
     * Clients array
     */
    //TODO Map, HashMap, ArrayList, LinkedList??
    private final Client[] clients;

    /**
     * Add client to array
     * @param position
     * @param client
     */
    public void addClient(int position, final Client client){
        clients[position] = client;
    }

}
