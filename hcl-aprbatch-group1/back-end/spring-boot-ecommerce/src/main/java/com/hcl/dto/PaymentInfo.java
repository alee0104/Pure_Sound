package com.hcl.dto;

import lombok.Data;

@Data
public class PaymentInfo {

    private int amount;
    private String currency;

    public String receiptEmail;
}