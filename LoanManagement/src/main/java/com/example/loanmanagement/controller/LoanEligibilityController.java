package com.example.loanmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.loanmanagement.model.LoanEligibility;
import com.example.loanmanagement.service.LoanEligibilityService;

@RestController
@RequestMapping("/loan")
public class LoanEligibilityController {

    @Autowired
    private LoanEligibilityService service;

    @PostMapping("/eligibility")
    public LoanEligibility checkEligibility(
            @RequestParam Long customerId,
            @RequestParam double income,
            @RequestParam int creditScore) {
        return service.checkEligibility(customerId, income, creditScore);
    }
}
