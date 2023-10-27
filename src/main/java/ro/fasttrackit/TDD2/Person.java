package ro.fasttrackit.TDD2;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
//@Builder
@EqualsAndHashCode
public class Person {
    private final Integer id;
    private final String name;
    private final Integer age;
    private static Integer idCounter = 1;

    public Person(String name, Integer age) {
        this.id = idCounter++;
        if (name.isEmpty() || name.matches(".*(.)\\1{2,}.*")) {
            throw new IllegalArgumentException("Invalid name");
        } else {
            this.name = name;
        }

        this.age = age;
    }
}
