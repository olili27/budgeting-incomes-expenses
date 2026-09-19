package com.thy.minimalist.budgetingIncomesExpenses.repository;

import com.thy.minimalist.budgetingIncomesExpenses.model.RecordLabel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordLabelRepository extends JpaRepository<RecordLabel, Integer> {
}
