package com.franktranvantu.jacoco;

import java.util.Objects;

public class App {
    public String sayHello(String name) {
        if (Objects.isNull(name)) {
            return "Hello anonymous";
        }
        return String.format("Hello %s", name);
    }
}
