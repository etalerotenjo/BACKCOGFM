package com.ibero.mantenimiento.controller.service.persistence.repository;

import com.mili.cogfm.COGFM.persistence.entity.AuditLogHisEntity;
import com.mili.cogfm.COGFM.persistence.model.interfaces.ITopeXdependHis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryAuditLog extends JpaRepository<AuditLogHisEntity, Long> {

    @Query(value = "SELECT * FROM CGFM_HIS_LOG_MEDIUM_TBL ORDER BY FECHA DESC   ", nativeQuery = true)
    List<AuditLogHisEntity> buscarLogAuditoriaList();

}
