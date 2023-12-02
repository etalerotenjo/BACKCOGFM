package com.ibero.mantenimiento.controller.service.persistence.entitys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ACC_HIS_PRODISACC_DOWN_TBL")
@IdClass(HisProdisaccPk.class)
public class HisProdisaccEntity implements Serializable {

    /**
     * ESTE ENTITY PERTENECE A LA TABLA ACC_EMIACC_HIS_TBL
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "FECHA_ASAM")
    private Integer fechaAsamInt;

    @Column(name = "CANT_ACC")
    private BigDecimal cantAcc;

    @Column(name = "VAL_DIV")
    private BigDecimal valDiv;

    @Column(name = "VAL_NOM")
    private BigDecimal valNom;

    @Column(name = "TIP_ACC")
    private Integer tipAcc;

    @Column(name = "POR_DIVEXT")
    private BigDecimal porDivExt;

    @Column(name = "VAL_DIVEXT")
    private BigDecimal valDivExt;

    @Column(name = "USR_RADIC")
    private String usrRadic;

    @Column(name = "VAL_DIV_MEN")
    private BigDecimal valDivMen;

    @Column(name = "CANT_ACCS_ACCN")
    private BigDecimal cantAccsAccn;

    @Column(name = "NV_ACC_EMITIR")
    private BigDecimal nvAccEmitir;

    @Column(name = "VAL_UNIT_ACCENT")
    private BigDecimal valUnitAccent;

    @Column(name = "TOT_DIV_AN")
    private BigDecimal totDivAn;

    @Column(name = "VAL_PRIMA_COLOC")
    private BigDecimal valPrimaColoc;

    @Column(name = "DECS_PAGO_ACC")
    private String decsPagoAcc;

    @Column(name = "ANIO_UTILIDAD")
    private String anioUtilidad;

    @Id
    @Column(name = "ACC_EMISIONES_TBL_COD_EMI")
    private Integer accEmisionesTblCodEmi;

    @ManyToOne
    @JoinColumn(name = "ACC_EMISIONES_TBL_COD_EMI", insertable=false, updatable=false)
    @JsonIgnore
    private HisEmisionesDownEntity hisEmisionesEntity;

}
