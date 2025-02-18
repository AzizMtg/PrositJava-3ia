package tn.esprit.gestionzoo.entities;
import java.util.Scanner;

public class Animal{
    public String family;
    public int age;
    public String name;
    public boolean isMammal;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif !");
        }
        this.age = age;
    }


    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public Animal(){
        System.out.println("Creating Animal");
    }
}