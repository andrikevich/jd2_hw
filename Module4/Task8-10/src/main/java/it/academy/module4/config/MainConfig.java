package it.academy.module4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "it.academy.module4",includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
        classes = Component.class))
public class MainConfig {

}
