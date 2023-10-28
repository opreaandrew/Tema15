package ro.fasttrackit.TDD2;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
//@Builder
@EqualsAndHashCode
@ToString
public class Person {
    private final Integer id;
    private final String name;
    private final Integer age;
    private static Integer idCounter = 1;

    public Person(String name, Integer age) {
        if (name.isBlank() || name.matches(".*(.)\\1{2,}.*")) {
            throw new IllegalArgumentException("Invalid name");
        } else if (age < 0 || age > 130) {
            throw new IllegalArgumentException("Invalid age");
        } else {
            this.id = idCounter++;
            this.name = name;
            this.age = age;
        }

    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
