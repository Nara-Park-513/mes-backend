package com.samsung.mes.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QualityManagementRequest {

    private String inspectionDate;
    private String itemCode;
    private String itemName;
    private Integer inspectionQty;
    private Integer defectQty;
    private String judgementResult;
    private String actionType;
    private String actionStatus;
}