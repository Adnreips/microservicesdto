package com.springboot.microservice;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class CurrencyConversionDto implements Serializable {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal multiply;
    private int port;

    public CurrencyConversionDto() {
    }

    public CurrencyConversionDto(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity, BigDecimal multiply, int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.multiply = multiply;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyConversionDto that = (CurrencyConversionDto) o;
        return port == that.port && Objects.equals(id, that.id) && Objects.equals(from, that.from) && Objects.equals(to, that.to) && Objects.equals(conversionMultiple, that.conversionMultiple) && Objects.equals(quantity, that.quantity) && Objects.equals(multiply, that.multiply);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, to, conversionMultiple, quantity, multiply, port);
    }

    @Override
    public String toString() {
        return "CurrencyConversionDto{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", conversionMultiple=" + conversionMultiple +
                ", quantity=" + quantity +
                ", multiply=" + multiply +
                ", port=" + port +
                '}';
    }
}
