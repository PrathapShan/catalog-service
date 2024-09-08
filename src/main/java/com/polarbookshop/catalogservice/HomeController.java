package com.polarbookshop.catalogservice;

/**
 * @author Prathap S
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "welcome to book catalog";
    }
}
