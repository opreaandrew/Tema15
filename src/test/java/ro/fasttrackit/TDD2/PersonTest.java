package ro.fasttrackit.TDD2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonTest {

    private static Person testPerson;

    @BeforeEach
    void setupEach() {
        testPerson = new Person("Gigel", 5);
    }

    @Test
    void invalidId() {
        // WHEN
        int id = testPerson.getId();

        // THEN
        assertThat(testPerson.getId()).isPositive().isEqualTo(1);
    }

//    @Test
//    void emptyName() {
//        //GIVEN
//        Person testPerson2;
//        Person testPerson3;
//        //WHEN
//        testPerson2 = new Person(null, 45);
//        testPerson3 = new Person("", 45);
//
//        //THEN
//        assertThat(testPerson2.getName()).isNotNull();
//        assertThat(testPerson3.getName()).isNotBlank();


//        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
//            Person testPerson2 = new Person(null, 54);
//        }, "IllegalArgumentException was expected");
//
//        assertEquals("For input string: \"null\"", thrown.getMessage());
//    }

//    @Test
//    void threeOrMoreIdenticalCharsInName() {
//    }

    @Test
    void getAge() {
        // WHEN
        int id = testPerson.getAge();

        // THEN
        assertThat(testPerson.getAge()).isPositive().isEqualTo(5);
    }

//    @Test
//    void invalidAge(){
//    insert some exception handling here
//    }


}