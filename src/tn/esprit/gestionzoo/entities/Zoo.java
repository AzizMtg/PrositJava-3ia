package tn.esprit.gestionzoo.entities;
import java.util.Scanner;

public class Zoo
{
    public Animal[] animals;
    public String name;
    public String city;
    //instruction 14
    public static final int nbrCages=25;

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        //this.nbrCages = nbrCages;
    }
    public Zoo(){
        System.out.println("Creating Zoo");
    }

    public void displayZoo(){
        System.out.println("Name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Nbr Cages: " + nbrCages);
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i] != null) {
                System.out.println("Animal number "+i+": "+this.animals[i].name);
            }
        }
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide !");
        }
        this.name = name;
    }
    //inst 9
    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + "}";
    }


    public boolean addAnimal(Animal animal){
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i] == null) {
                this.animals[i] = animal;
                System.out.println("Animal added");
                return true;
            }

        }
        return false;

    }

    public int SearchAnimal(Animal animal){
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i] == animal) {
                return i;
            }
        }
        return -1;
    }

    public boolean isZooFull(){
        int sum=0;
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i] != null) {
                sum++;
            }
        }
        if (sum==nbrCages) {
            System.out.println("Zoo Full");
            return true;
        }else{
            System.out.println("Zoo Not Full");
            return false;
        }
    }


    public Zoo comparerZoo(Zoo z1, Zoo z2){
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < z1.animals.length; i++) {
            if (z1.animals[i] != null) {
                sum1++;
            }
        }
        for (int i = 0; i < z2.animals.length; i++) {
            if (z2.animals[i] != null) {
                sum2++;
            }
        }

        if (sum1>sum2) {
            return z1;
        }else {
            return z2;
        }


    }

}