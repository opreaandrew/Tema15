package ro.fasttrackit.TDD2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

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

    @Test
    void emptyName() {
        //GIVEN
        Person testPerson2;
        Person testPerson3;
        //WHEN
        testPerson2 = new Person(null, 45);
        testPerson3 = new Person("", 45);

        //THEN
        Exception exception = assertThatThrownBy()
        assertThat(testPerson2.getName()).isNotNull();
        assertThat(testPerson3.getName()).isNotBlank();
    }

    @Test
    void threeOrMoreIdenticalCharsInName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void canEqual() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }

    @Test
    void builder() {
    }
}