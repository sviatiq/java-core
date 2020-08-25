package lesson1.zooclub;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map club = new HashMap();
        Pet bucky = new Pet(PetType.SHEPARD, "Bucky", 2);
        Person person = new Person("Sviat", bucky);
        ZooClub zooClub = new ZooClub(club);
        //1
        zooClub.addPersonToClub(person);
        //2
//        zooClub.addPetToPerson(person, pet);
//        //3
//        zooClub.deletePetFromPerson(person, pet);
//        //4
//        zooClub.deletePersonFromClub(person);
//        //5
//        zooClub.deletePerFromAllPerson(pet);
//        //6
        zooClub.showClub();
    }
}
