package com.thy.minimalist.budgetingIncomesExpenses.controller;

import com.thy.minimalist.budgetingIncomesExpenses.model.Label;
import com.thy.minimalist.budgetingIncomesExpenses.service.interfaces.LabelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/labels")
public class LabelController {

    private final LabelService labelService;

    public LabelController(LabelService labelService) {
        this.labelService = labelService;
    }

    @GetMapping
    public List<Label> getAllLabels() {
        return  labelService.getAllLabels();
    }
}
