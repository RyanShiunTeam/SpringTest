package com.example.ioc;

import org.springframework.stereotype.Component;

// 只管印表機要做什麼 ( 規定 )
public interface Printer {
    // 如果你實作的話 就醫定要可以印東西
    void print(String message);
}
