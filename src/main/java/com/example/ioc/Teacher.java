package com.example.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

    // Dependency Injection (DI) 加在變數上，用於取得 Spring Bean
    @Autowired
    @Qualifier("hpPrinter") // error
    private Printer printer;

    public void teach() {
        printer.print("I'm a teacher");
    }
}


