package com.example.moduleapi;

import com.example.moduledomain.ModuleDomainRoot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {
        ModuleDomainRoot.class,
        ModuleApiApplication.class
})
public class ModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApiApplication.class, args);
    }

}
