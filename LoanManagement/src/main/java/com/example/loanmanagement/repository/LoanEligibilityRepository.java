package com.example.loanmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.loanmanagement.model.LoanEligibility;
import org.springframework.stereotype.Repository;

@Repository

public interface LoanEligibilityRepository extends JpaRepository<LoanEligibility, Long> {

}