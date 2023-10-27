package ro.fasttrackit.TDD2;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private final Integer id;
    private final String name;
    private final Integer age;
    private static Integer idCounter = 1;
    public Person(String name, Integer age) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
    }
}
