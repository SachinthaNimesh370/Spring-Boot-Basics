package com.springbootacademy.point_of_sale.entity;

import com.springbootacademy.point_of_sale.entity.enums.MeasuringUnitType;

import javax.persistence.*;
import java.lang.reflect.Type;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @Column(name = "item_id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;

    @Column(name = "item_name",length = 100,nullable = false)
    private String itemName;

    @Enumerated(EnumType.STRING)
    @Column(name = "measuring_Type",length = 100,nullable = false)
    private MeasuringUnitType measuringUnitType;

    @Column(name = "balance_Qty",length = 100,nullable = false)
    private double balanceQty;

    @Column(name = "supplier_Price",length = 100,nullable = false)
    private double supplierPrice;

    @Column(name = "selling_Price",length = 100,nullable = false)
    private double sellingPrice;

    @Column(name = "active_state" , columnDefinition = "TINYINT default 1")
    private boolean activeState;

}
