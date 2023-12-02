package com.ibero.mantenimiento.controller.service.persistence.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CGFM_HIS_LOG_MEDIUM_TBL")
public class AuditLogHisEntity implements Serializable {

    /**
     * ESTE ENTITY PERTENECE A LA TABLA CGFM_HIS_LOG_MEDIUM_TBL
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM", length = 7)
    private Long item;

    @Column(name = "FECHA")
    private LocalDateTime fecha;

    @Column(name = "MODULO")
    private String modulo;

    @Column(name = "OPERACION")
    private String operacion;

    @Column(name = "USUARIO")
    private String usuario;

}
