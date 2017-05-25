package org.lumi.microservices.account;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 25/5/2017.
 */

@Configuration
@ComponentScan("org.lumi.microservices.account")
public class AccountConfiguration {
    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();

    }

}
