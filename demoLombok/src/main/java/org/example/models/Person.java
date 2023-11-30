package org.example.models;

import lombok.*;

@ToString
@RequiredArgsConstructor // constructor with one argument (thanks to @NonNull)
@NoArgsConstructor // constructor without args
@AllArgsConstructor // constructor with all the arguments
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // it's gonna look all the properties with @EqualsAndHashCode.Include and gonna compare the adress
public class Person {

    @Getter
    @Setter
    @NonNull //constructor with id
    private int id;

    @Setter
    @EqualsAndHashCode.Include
    private String firstname;

    @Setter
    @EqualsAndHashCode.Include
    private String lastname;

}
