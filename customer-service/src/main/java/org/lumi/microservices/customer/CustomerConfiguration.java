package org.lumi.microservices.customer;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 25/5/2017.
 */

@Configuration
@ComponentScan("org.lumi.microservices.customer")
public class CustomerConfiguration {
    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();

    }

}
