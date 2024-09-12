package com.springbootacademy.point_of_sale.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
@TypeDefs({
        //Hibernet Type 5 Dependancy magin
        @TypeDef(name = "json",typeClass = JsonType.class)
})
public class Customer {
    @Id //primary key eka define karana anotation eka
    @Column(name = "customer_id",length = 45)
    private int customerId;
    @Column(name = "customer_name",length = 100,nullable = false)
    private String customerName;

    @Column(name ="customer_address",length = 255)
    private String customerAddress;

    @Column(name = "customer_salary")
    private double salary;

    @Type(type = "json")
    @Column(name = "contact_numbers",length = 10,columnDefinition = "json")
    private ArrayList contactnumber;

    @Column(name = "nic")
    private String nic;

    @Column(name = "active_state" , columnDefinition = "TINYINT default 1")
    private boolean active;

}
