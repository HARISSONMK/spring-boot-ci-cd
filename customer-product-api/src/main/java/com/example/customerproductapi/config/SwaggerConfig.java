package com.example.customerproductapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Customer & Product API",
                version = "1.0",
                description = "API for managing customers and products"
        )
)
public class SwaggerConfig {
}
