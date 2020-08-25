package lesson1.zooclub;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private Map<Person, List<Pet>> club;

    public ZooClub() {
    }

    public ZooClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    void addPersonToClub(Person person){
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(person.getPet());
        club.put(person, pets);
        System.out.println(club);
    }
    //2
    void addPetToPerson(Person person, Pet pet){

    }
    //3
    void deletePetFromPerson(Person person, PetType petType){
        if(person.getPet().getName().toUpperCase() == petType.name()){

        }
    }
    //4
    void deletePersonFromClub(Person person){}
    //5
    void deletePetFromAllPerson(Pet pet){}


    //6
    void showClub(){
        System.out.println(club);
    }
    @Override
    public String toString() {
        return "ZooClub{" +
                "club=" + club +
                '}';
    }
}
