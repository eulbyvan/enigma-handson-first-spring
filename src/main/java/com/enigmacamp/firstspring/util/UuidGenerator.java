package com.enigmacamp.firstspring.util;

import java.util.UUID;

public class UuidGenerator implements IRandomStringGenerator {
    @Override
    public String random() {
        return UUID.randomUUID().toString();
    }
}
