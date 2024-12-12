package com.example.loanmanagement.service;

import org.springframework.stereotype.Service;
import com.example.loanmanagement.model.LoanEligibility;

@Service
public class LoanEligibilityService {

    public LoanEligibility checkEligibility(Long customerId, double income, int creditScore) {
        LoanEligibility eligibility = new LoanEligibility();
        eligibility.setId(customerId);
        eligibility.setEligible(true);
        if (creditScore >= 700 && income >= 50000) {
            eligibility.setEligible(true);
            eligibility.setApprovedAmount(5000); // Example calculation
        } else {
           eligibility.setEligible(false);
            eligibility.setApprovedAmount(0);
        }

        return eligibility;
    }
}
