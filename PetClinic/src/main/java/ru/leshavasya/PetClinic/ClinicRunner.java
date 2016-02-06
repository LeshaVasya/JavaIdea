package ru.leshavasya.PetClinic;

/**
 * Created by Vasyamfx on 06.02.2016.
 */
public class ClinicRunner {
    public static void main (String[] args){
        Clinic clinic = new Clinic(10);
        clinic.addClient(1, new Client("Vasya", new Dog(new Animal("Bobik"))));
    }
}
