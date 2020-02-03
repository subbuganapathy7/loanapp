package com.loan.apps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.loan.apps.model.Request;
import com.loan.apps.model.Response;
import com.loan.apps.service.PaymentPlanGeneratorService;

import java.util.List;

@RestController
@RequestMapping(value = "generate-plan")
public class PaymentPlanGeneratorController {

    @Autowired
    private PaymentPlanGeneratorService paymentPlanGeneratorService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<Response> generatePaymentPlan(@RequestBody final Request request) {
        return paymentPlanGeneratorService.generatePaymentPlan(request);
    }
}