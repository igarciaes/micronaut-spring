package greeting.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ExampleConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "example")
    public ExampleBean exampleBean() {
        return new ExampleBean();
    }
}
