import java.util.Scanner;

class Animal{
    String family;
    private int age;
    String name;
    boolean isMammal;

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


class Zoo
{
    Animal [] animals;
    private String name;
    String city;
    //instruction 14
    static final int nbrCages=25;

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


    boolean addAnimal(Animal animal){
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i] == null) {
                this.animals[i] = animal;
                System.out.println("Animal added");
                return true;
            }

        }
        return false;

    }

    int SearchAnimal(Animal animal){
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i] == animal) {
                return i;
            }
        }
        return -1;
    }

    boolean isZooFull(){
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


    Zoo comparerZoo(Zoo z1, Zoo z2){
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


public class ZooManagement
{
    int nbrCages=20;
    String zooName="my zoo";





    public static void main(String[] args) {
// instruction 1

        ZooManagement z = new ZooManagement();
        System.out.println(z.zooName+" comporte "+z.nbrCages);

        //instruction 2
        Scanner sc = new Scanner(System.in);
        System.out.println("ecrire nom Zoo expl : Esprit ");
        z.zooName=sc.nextLine();
        System.out.println("ecrire nombre de cages");
        z.nbrCages=Integer.parseInt(sc.nextLine());
        System.out.println(z.zooName+" comporte "+z.nbrCages+" s̶a̶l̶l̶e̶s̶ Cages");

        //instruction 5
        Animal lion=new Animal();
        //lion.name="lion";
        //lion.age=10;
        lion.family="lionet";
        lion.isMammal=true;

        Zoo zo=new Zoo();
        //zo.nbrCages=25;
        zo.animals=new Animal[zo.nbrCages];
        zo.animals[0]=lion;
        //zo.name="Bellviedaire";
        zo.city="tunis";


        //inst7
        Animal hayawen=new Animal("hmarat","hmar",20,true);

        for (int i = 0; i < zo.animals.length; i++) {
            if (zo.animals[i] == null) {
                zo.animals[i] = hayawen;
                break;
            }
        }

        //inst 8
        zo.displayZoo();
        System.out.print(zo);
        System.out.println(zo.toString());
        Animal karakouz = new Animal("karakouzet","karakouz",20,true);
        zo.addAnimal(karakouz);

        System.out.println(zo.SearchAnimal(karakouz));
        zo.isZooFull();








    }
}
