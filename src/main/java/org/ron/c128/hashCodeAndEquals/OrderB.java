package org.ron.c128.hashCodeAndEquals;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@AllArgsConstructor
public class OrderB {

    private final LocalDate orderDate;
    private final int orderNumber;

    @Getter
    private String customerName;

    @Getter
    private int state;

    @Getter
    private String productType;

    @Setter
    private BigDecimal area;

    @Getter
    @Setter
    private BigDecimal materialCost;

    @Getter
    @Setter
    private BigDecimal labourCost;

    @Getter
    @Setter
    private BigDecimal tax;
}
