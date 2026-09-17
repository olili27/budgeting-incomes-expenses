package com.thy.minimalist.budgetingIncomesExpenses.repository;

import com.thy.minimalist.budgetingIncomesExpenses.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Integer> {
}
