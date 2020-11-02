package configurable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@ServletComponentScan
//@SpringBootApplication
@ComponentScan
@SpringBootConfiguration
@EnableSpringConfigured
@EnableLoadTimeWeaving
public class CustomBeanApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomBeanApplication.class, args);
    }
}
