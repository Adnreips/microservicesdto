package com.springboot.microservice;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

public class CurrencyConversionDto implements Serializable {
    static final long SerialVersionUID = -1;
    private UUID id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal multiply;
    private int port;

    public CurrencyConversionDto(UUID id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity, BigDecimal multiply, int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.multiply = multiply;
        this.port = port;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getMultiply() {
        return multiply;
    }

    public void setMultiply(BigDecimal multiply) {
        this.multiply = multiply;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
