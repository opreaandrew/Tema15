package ro.fasttrackit.TDD2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    private static PersonService serviceTest;

    @BeforeEach
    void setupEach() {
        serviceTest = new PersonService();
    }

    @AfterEach
    void resetIdCounter() throws NoSuchFieldException, IllegalAccessException {
        Field idCounterField = Person.class.getDeclaredField("idCounter");
        idCounterField.setAccessible(true);
        idCounterField.set(null, 1);
    }

    @Test
    void addPerson() {
        Person result = serviceTest.addPerson(new Person(null, "Andrei", 33));
        assertThat(result.toString()).isEqualTo("Person(id=1, name=Andrei, age=33)");
    }

    @Test
    void removePerson() {
        Person added = serviceTest.addPerson(new Person(null,"Andrei", 33));
        Person result = serviceTest.removePerson(1);
        assertThat(result.toString()).isEqualTo("Person(id=1, name=Andrei, age=33)");
    }

    @Test
    void getAllPersons() {
        Person peep1 = serviceTest.addPerson(new Person("Andrei", 33));
        Person peep2 = serviceTest.addPerson(new Person("Andre", 32));
        List<Person> testList = List.of(peep1, peep2);

        assertThat(serviceTest.getAllPersons()).isEqualTo(testList);
        System.out.println(serviceTest.getAllPersons().toString());
    }

    @Test
    void getPersonsOlderThan() {
        Person peep1 = serviceTest.addPerson(new Person("Andrei", 33));
        Person peep2 = serviceTest.addPerson(new Person("Andre", 29));
        Person peep3 = serviceTest.addPerson(new Person("Andr", 20));
        List<Person> testList = List.of(peep1, peep2);

        assertThat(serviceTest.getPersonsOlderThan(25)).isEqualTo(testList);
    }

    @Test
    void getAllPersonNames() {
        Person peep1 = serviceTest.addPerson(new Person("Andrei", 33));
        Person peep2 = serviceTest.addPerson(new Person("Andre", 32));
        List<String> testList = List.of("Andrei", "Andre");

        assertThat(serviceTest.getAllPersonNames()).isEqualTo(testList);
    }

    @Test
    void getPerson() {
        Person peep1 = serviceTest.addPerson(new Person("Andrei", 33));
        Person peep2 = serviceTest.addPerson(new Person("Andre", 32));

        assertThat(serviceTest.getPerson("Andre")).isEqualTo(peep2);
    }

    @Test
    void getPersonById() {
        Person peep1 = serviceTest.addPerson(new Person(null, "Andrei", 33));
        Person peep2 = serviceTest.addPerson(new Person(null, "Andre", 32));

        assertThat(serviceTest.getPersonById(2)).isEqualTo(peep2);
    }
}