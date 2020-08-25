package lesson1.extra_task;

import java.util.List;

public class PersonAuth {
    private Person person;
    private Auth auth;

    public PersonAuth() {
    }

    public PersonAuth(Person person, Auth auth) {
        this.person = person;
        this.auth = auth;
    }

    public void personWithAuth(List<Person> person, List<Auth> auth) {
        for (Person person1 : person) {
            for (Auth auth1 : auth) {
                if (person1.getId() == auth1.getId()) {
                    PersonAuth personAuth = new PersonAuth(person1, auth1);
                    System.out.println(personAuth);
                }
            }
        }
    }


        @Override
        public String toString () {
            return "PersonAuth{" +
                    "person=" + person +
                    ", auth=" + auth +
                    '}';
        }
    }
