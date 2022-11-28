package com.enigmacamp.firstspring.util;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Qualifier("uuid")
public class UuidGenerator implements IRandomStringGenerator {
    @Override
    public String random() {
        return UUID.randomUUID().toString();
    }
}
