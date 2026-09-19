package com.thy.minimalist.budgetingIncomesExpenses.repository;

import com.thy.minimalist.budgetingIncomesExpenses.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabelRepository extends JpaRepository<Label, Integer> {
}
