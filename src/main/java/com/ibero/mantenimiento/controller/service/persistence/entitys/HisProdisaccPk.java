package com.ibero.mantenimiento.controller.service.persistence.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HisProdisaccPk implements Serializable {

    private Integer fechaAsamInt;

    private Integer accEmisionesTblCodEmi;

}
