package ro.fasttrackit.TDD2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

import java.lang.reflect.Field;


import static org.assertj.core.api.Assertions.*;

class PersonTest {

    private static Person testPerson;

    @BeforeEach
    void setupEach() {
        testPerson = new Person("Gigel", 5);
    }

    @AfterEach
    void resetIdCounter() throws NoSuchFieldException, IllegalAccessException {
        Field idCounterField = Person.class.getDeclaredField("idCounter");
        idCounterField.setAccessible(true);
        idCounterField.set(null, 1);
    }

    @Test
    void validId() {
        assertThat(testPerson.getId()).isPositive().isEqualTo(1);
    }

    @Test
    void getName() {
        assertThat(testPerson.getName()).isEqualTo("Gigel");
    }

    @Test
    void emptyName() {
        assertThatThrownBy(() -> new Person("   ", 25))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid name");
    }

    @Test
    void threeOrMoreIdenticalCharsInName() {
        assertThatThrownBy(() -> new Person("rvvvrfgdswv", 25))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid name");
    }

    @Test
    void getAge() {
        assertThat(testPerson.getAge()).isPositive().isEqualTo(5);
    }

    @Test
    void invalidAge() {
        assertThatThrownBy(() -> new Person("Gigelus", -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid age");
    }


}