package nl.patrickkik.battman.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Battery {

    private UUID id;
    private String name;
    private int capacity;
    private Brand brand;
    private Chemistry chemistry;
    private BigDecimal voltage;
    private LocalDate dateOfPurchage;
    private Size size;

}
