package ro.fasttrackit.TDD2;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class PersonService {
    List<Person> people;

    public PersonService() {
        this.people = new ArrayList<>();
    }

    public Person addPerson(Person person) {
        Person newPerson = new Person(person.getName(),person.getAge());
        people.add(newPerson);
        return newPerson;
    }

    public Person removePerson(int id) {
        Person removed = new Person(null,null);
        for (Person person : people) {
            if(person.getId() == id){
                removed = person;
                people.remove(person);
                return removed;
            }
        }
        return null;
    }

    public List<Person> getAllPersons() {
        return new ArrayList<>(people);
    }

    public List<Person> getPersonsOlderThan(int age) {
        return people.stream()
                .filter(peep -> peep.getAge() > age)
                .toList();
    }

    public List<String> getAllPersonNames() {
        return people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public Person getPerson(String name) {
        return people.stream()
                .filter(person -> name.equalsIgnoreCase(person.getName()))
                .findAny()
                .orElse(null);
    }

    public Person getPersonById(int id) {
        return people.stream()
                .filter(person -> id == person.getId())
                .findAny()
                .orElse(null);
    }

}
