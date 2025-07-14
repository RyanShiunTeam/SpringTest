package com.example.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController { // Servlet

    @Autowired
    @Qualifier("hpPrinter")
    private  Printer printer;

    @RequestMapping("/test")
    public String test() {
        printer.print("Ryan test5");
        return "Hello World";
    }
}
// http://localhost:8080/Bank/queryActivity