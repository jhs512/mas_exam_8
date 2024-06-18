package com.ll.module_app_member;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class All {
    @Value("${custom.site.name}")
    private String siteName;

    @Bean
    public ApplicationRunner initAll() {
        return args -> System.out.println("siteName: " + siteName);
    }
}
