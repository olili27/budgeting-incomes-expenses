package com.thy.minimalist.budgetingIncomesExpenses.repository;

import com.thy.minimalist.budgetingIncomesExpenses.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelRepository extends JpaRepository<Label, Integer> {
}
