package com.thy.minimalist.budgetingIncomesExpenses.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "record_labels")
@Data
public class RecordLabel {

    @EmbeddedId
    private RecordLabelId id;

    @ManyToOne
    @MapsId("recordId")
    @JoinColumn(name = "record_id", nullable = false)
    private Record record;

    @ManyToOne
    @MapsId("labelId")
    @JoinColumn(name = "label_id", nullable = false)
    private Label label;
}
