package com.thy.minimalist.budgetingIncomesExpenses.controller;

import com.thy.minimalist.budgetingIncomesExpenses.model.Label;
import com.thy.minimalist.budgetingIncomesExpenses.service.interfaces.LabelService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Label createNewLabel(@Valid @RequestBody Label label) {
        return labelService.createNewLabel(label);
    }
}
