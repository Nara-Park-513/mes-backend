package com.samsung.mes.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.samsung.mes.dto.QualityManagementRequest;
import com.samsung.mes.entity.QualityManagement;
import com.samsung.mes.repository.QualityManagementRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class QualityManagementService {

    private final QualityManagementRepository qualityManagementRepository;

    public QualityManagement create(QualityManagementRequest request) {
        validate(request);

        QualityManagement entity = new QualityManagement();
        entity.setInspectionDate(request.getInspectionDate().trim());
        entity.setItemCode(request.getItemCode().trim());
        entity.setItemName(request.getItemName().trim());
        entity.setInspectionQty(request.getInspectionQty());
        entity.setDefectQty(request.getDefectQty());
        entity.setJudgementResult(request.getJudgementResult().trim());
        entity.setActionType(request.getActionType().trim());
        entity.setActionStatus(request.getActionStatus().trim());

        return qualityManagementRepository.save(entity);
    }

    @Transactional(readOnly = true)
    public Page<QualityManagement> getList(Pageable pageable) {
        return qualityManagementRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public QualityManagement getById(Long id) {
        return qualityManagementRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 품질관리 데이터가 없습니다. id=" + id));
    }

    public QualityManagement update(Long id, QualityManagementRequest request) {
        validate(request);

        QualityManagement entity = getById(id);
        entity.setInspectionDate(request.getInspectionDate().trim());
        entity.setItemCode(request.getItemCode().trim());
        entity.setItemName(request.getItemName().trim());
        entity.setInspectionQty(request.getInspectionQty());
        entity.setDefectQty(request.getDefectQty());
        entity.setJudgementResult(request.getJudgementResult().trim());
        entity.setActionType(request.getActionType().trim());
        entity.setActionStatus(request.getActionStatus().trim());

        return entity;
    }

    public void delete(Long id) {
        QualityManagement entity = getById(id);
        qualityManagementRepository.delete(entity);
    }

    private void validate(QualityManagementRequest request) {
        if (request.getInspectionDate() == null || request.getInspectionDate().isBlank()) {
            throw new IllegalArgumentException("검사일자를 입력하세요.");
        }
        if (request.getItemCode() == null || request.getItemCode().isBlank()) {
            throw new IllegalArgumentException("품목코드를 입력하세요.");
        }
        if (request.getItemName() == null || request.getItemName().isBlank()) {
            throw new IllegalArgumentException("품목명을 입력하세요.");
        }
        if (request.getInspectionQty() == null) {
            throw new IllegalArgumentException("검사수량을 입력하세요.");
        }
        if (request.getInspectionQty() < 0) {
            throw new IllegalArgumentException("검사수량은 0 이상이어야 합니다.");
        }
        if (request.getDefectQty() == null) {
            throw new IllegalArgumentException("불량수량을 입력하세요.");
        }
        if (request.getDefectQty() < 0) {
            throw new IllegalArgumentException("불량수량은 0 이상이어야 합니다.");
        }
        if (request.getDefectQty() > request.getInspectionQty()) {
            throw new IllegalArgumentException("불량수량은 검사수량보다 클 수 없습니다.");
        }
        if (request.getJudgementResult() == null || request.getJudgementResult().isBlank()) {
            throw new IllegalArgumentException("판정결과를 입력하세요.");
        }
        if (request.getActionType() == null || request.getActionType().isBlank()) {
            throw new IllegalArgumentException("조치구분을 입력하세요.");
        }
        if (request.getActionStatus() == null || request.getActionStatus().isBlank()) {
            throw new IllegalArgumentException("조치상태를 입력하세요.");
        }
    }
}