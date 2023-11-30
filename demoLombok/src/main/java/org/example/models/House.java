package org.example.models;

import lombok.Data;

//@Data
// All together now: A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields,
// and @Setter on all non-final fields, and @RequiredArgsConstructor!
// for more features and shortcuts : https://projectlombok.org/features/
@Data
public class House {
    private final int id;
    private String city;
    private int number;
    private String adress;
}
