package ru.leshavasya.PetClinic;

import java.util.UUID;

/**
 * Created by Vasyamfx on 06.02.2016.
 */
public class Client {
    public Client(String clientName, Pet pet){
        this.clientName = clientName;
        this.pet = pet;
        this.clientId = UUID.randomUUID();
    }
    private final UUID clientId;
    private final String clientName;
    private final Pet pet;

    public String getClientName(){
        return clientName;
    }
    public Pet getPet(){
        return pet;
    }

    /**
     * Unique field to search
     * @return
     */
    public UUID getClientId(){
        return clientId;
    }
}
