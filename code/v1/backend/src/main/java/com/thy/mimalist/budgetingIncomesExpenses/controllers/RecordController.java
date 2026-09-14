package com.thy.mimalist.budgetingIncomesExpenses.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {

    @GetMapping("/greet")
    public String returnGreeting() {
        return "Good evening, thy minimalist";
    }
}
