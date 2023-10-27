package ro.fasttrackit.TDD2;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


public class PersonService {
    List<Person> people;

    public Person addPerson(Person person){
        return null;
    }

    public Person removePerson(int id){
        return null;
    }

    public List<Person> getAllPersons(){
        return new ArrayList<>();
    }

    public List<Person> getPersonsOlderThan(int age){
        return new ArrayList<>();
    }

    public List<Person> getAllPersonNames(){

        return new ArrayList<>();
    }

    public Person getPerson(String name){
        return null;
    }

    public Person getPersonById(int id){
        return null;
    }

}
