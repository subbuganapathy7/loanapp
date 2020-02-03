package com.loan.apps.model;

import java.math.BigDecimal;

import com.loan.apps.domain.PaymentPerMonth;

public class Response {
    private BigDecimal borrowerPaymentAmount;
    private String date;
    private BigDecimal initialOutstandingPrincipal;
    private BigDecimal interest;
    private BigDecimal principal;
    private BigDecimal remainingOutstandingPrincipal;

    public Response(final PaymentPerMonth paymentPerMonth) {
        this.borrowerPaymentAmount = paymentPerMonth.getBorrowerPaymentAmount();
        this.date = paymentPerMonth.getDate();
        this.initialOutstandingPrincipal = paymentPerMonth.getInitialOutstandingPrincipal();
        this.interest = paymentPerMonth.getInterest();
        this.principal = paymentPerMonth.getPrincipal();
        this.remainingOutstandingPrincipal = paymentPerMonth.getRemainingOutstandingPrincipal();
    }

    public BigDecimal getBorrowerPaymentAmount() {
        return borrowerPaymentAmount;
    }

    public String getDate() {
        return date;
    }

    public BigDecimal getInitialOutstandingPrincipal() {
        return initialOutstandingPrincipal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public BigDecimal getRemainingOutstandingPrincipal() {
        return remainingOutstandingPrincipal;
    }
}
