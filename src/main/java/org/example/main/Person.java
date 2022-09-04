package org.example.main;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
public class Person {
    private String name = "Ella";
    private final Parrot parrot;

    @Autowired
    public Person(@Qualifier("parrot2") Parrot parrot) {
        this.parrot = parrot;
    }
}
