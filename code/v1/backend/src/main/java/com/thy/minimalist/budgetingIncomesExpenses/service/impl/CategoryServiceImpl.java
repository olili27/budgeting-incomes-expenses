package com.thy.minimalist.budgetingIncomesExpenses.service.impl;

import com.thy.minimalist.budgetingIncomesExpenses.model.Category;
import com.thy.minimalist.budgetingIncomesExpenses.repository.CategoryRepository;
import com.thy.minimalist.budgetingIncomesExpenses.service.interfaces.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
