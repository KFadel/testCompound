package com.ntg.karim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.security.core.SpringSecurityCoreVersion;
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class,SpringSecurityCoreVersion.class,SecurityAutoConfiguration.class})

@SpringBootApplication
public class CompoundApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompoundApplication.class, args);
	}
}
