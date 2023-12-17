package com.bootprofiles;

import com.bootprofiles.beans.DataSource;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class BootProfilesPropertiesApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = run(BootProfilesPropertiesApplication.class, args);
        DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);
    }
}
