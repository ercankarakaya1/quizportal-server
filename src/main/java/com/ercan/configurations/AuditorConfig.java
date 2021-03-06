package com.ercan.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;



/**
 * @author Ercan Karakaya 04.12.2021
 */
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class AuditorConfig {

    /**
     * @return current auditor
     */
    @Bean
    public AuditorAware<String> auditorAware() {
        return new SecurityAuditorAware();
    }

}
