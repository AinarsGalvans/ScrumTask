package com.ctco.testSchool;

import java.time.LocalDateTime;

public class HelloWorld {
    public static String getHelloWorldText() {
        int hours = LocalDateTime.now().getHour();
        switch (hours) {
            case 8: case 9: case 10: case 11: return "Good morning world!";
            case 12: case 13: case 14: case 15: case 16: return "Good day world!";
            case 17: return "Hello world!";
            default: return "Good night world!";
        }
    }
}
