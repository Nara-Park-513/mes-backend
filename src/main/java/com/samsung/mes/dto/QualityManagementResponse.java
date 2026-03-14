package com.samsung.mes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import com.samsung.mes.entity.QualityManagement;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class QualityManagementResponse {

    private Long id;
    private String inspectionDate;
    private String itemCode;
    private String itemName;
    private Integer inspectionQty;
    private Integer defectQty;
    private String judgementResult;
    private String actionType;
    private String actionStatus;

    public static QualityManagementResponse from(QualityManagement entity) {
        return QualityManagementResponse.builder()
                .id(entity.getId())
                .inspectionDate(entity.getInspectionDate())
                .itemCode(entity.getItemCode())
                .itemName(entity.getItemName())
                .inspectionQty(entity.getInspectionQty())
                .defectQty(entity.getDefectQty())
                .judgementResult(entity.getJudgementResult())
                .actionType(entity.getActionType())
                .actionStatus(entity.getActionStatus())
                .build();
    }
}