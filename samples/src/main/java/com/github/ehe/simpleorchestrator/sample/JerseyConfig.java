/*
 *
 *  * Copyright (c) 2017. Eric He (eriche39@gmail.com)
 *  *
 *  * This software is licensed under
 *  *
 *  * MIT license
 *  *
 *
 */

package com.github.ehe.simpleorchestrator.sample;

import com.github.ehe.simpleorchestrator.sample.api.card.CardService;
import com.github.ehe.simpleorchestrator.visual.api.meta.MetaService;
import com.github.ehe.simpleorchestrator.sample.api.loan.LoanService;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.github.ehe.simpleorchestrator.*")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(CardService.class);
        register(LoanService.class);
        register(MetaService.class);
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
    }
}