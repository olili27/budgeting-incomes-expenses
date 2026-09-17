package com.thy.minimalist.budgetingIncomesExpenses.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class RecordLabelId implements Serializable {
    private Integer recordId;
    private Integer labelId;
}
