package tn.esprit.gestionzoo.main;
import java.util.Scanner;
import tn.esprit.gestionzoo.entities.*;


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