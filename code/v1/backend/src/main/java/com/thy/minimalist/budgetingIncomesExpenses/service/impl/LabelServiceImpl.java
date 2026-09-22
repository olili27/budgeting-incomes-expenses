package com.thy.minimalist.budgetingIncomesExpenses.service.impl;

import com.thy.minimalist.budgetingIncomesExpenses.model.Label;
import com.thy.minimalist.budgetingIncomesExpenses.repository.LabelRepository;
import com.thy.minimalist.budgetingIncomesExpenses.service.interfaces.LabelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelServiceImpl implements LabelService{
    private final LabelRepository labelRepository;

    public LabelServiceImpl(LabelRepository labelRepository) {
        this.labelRepository = labelRepository;
    }

    public List<Label> getAllLabels() {
        return  labelRepository.findAll();
    }
}
