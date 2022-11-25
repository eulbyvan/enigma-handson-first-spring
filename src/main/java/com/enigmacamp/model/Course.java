package com.enigmacamp.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Course {
    private @Getter @Setter String id;
    private @Getter @Setter String title;
    private @Getter @Setter String description;
}
