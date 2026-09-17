package com.thy.minimalist.budgetingIncomesExpenses.repository;

import com.thy.minimalist.budgetingIncomesExpenses.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
