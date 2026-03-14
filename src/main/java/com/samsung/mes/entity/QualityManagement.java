package com.samsung.mes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "quality_management")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QualityManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "inspection_date", nullable = false, length = 20)
    private String inspectionDate;

    @Column(name = "item_code", nullable = false, length = 100)
    private String itemCode;

    @Column(name = "item_name", nullable = false, length = 255)
    private String itemName;

    @Column(name = "inspection_qty", nullable = false)
    private Integer inspectionQty;

    @Column(name = "defect_qty", nullable = false)
    private Integer defectQty;

    @Column(name = "judgement_result", nullable = false, length = 50)
    private String judgementResult;

    @Column(name = "action_type", nullable = false, length = 50)
    private String actionType;

    @Column(name = "action_status", nullable = false, length = 50)
    private String actionStatus;
}