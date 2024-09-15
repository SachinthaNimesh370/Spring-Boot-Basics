package com.springbootacademy.point_of_sale.dto.responce;

import com.springbootacademy.point_of_sale.entity.enums.MeasuringUnitType;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class ItemGetResponceDTO {
    private int itemId;
    private String itemName;
    private double balanceQty;
    private double supplierPrice;
    private double sellingPrice;
    private boolean activeState;

}
