/*
 * Copyright (c) 2017. Eric He (eriche39@gmail.com)
 *
 * This software is licensed under
 *
 * MIT license
 *
 */

package com.github.ehe.simpleorchestrator.sample;

import com.github.ehe.simpleorchestrator.sample.api.card.CardService;
import com.github.ehe.simpleorchestrator.sample.api.loan.LoanService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Created by eric on 3/8/17.
 */
@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(CardService.class);
        register(LoanService.class);
    }
}