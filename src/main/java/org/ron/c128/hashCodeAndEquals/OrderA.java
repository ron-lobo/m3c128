package org.ron.c128.hashCodeAndEquals;


import java.math.BigDecimal;
import java.time.LocalDate;

@lombok.Data
public class OrderA {

    private final LocalDate orderDate;
    private final int orderNumber;
    private String customerName;
    private int state;
    private String productType;
    private BigDecimal area;
    private BigDecimal materialCost;
    private BigDecimal labourCost;
    private BigDecimal tax;
}
