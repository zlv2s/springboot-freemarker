package com.zouli.freemakerdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author leocathy
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
@PropertySource(value = "classpath:/resource.properties")
public class Resource {
    private String name;
    private Integer age;
}
