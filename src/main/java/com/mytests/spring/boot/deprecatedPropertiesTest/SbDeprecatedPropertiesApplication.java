package com.mytests.spring.boot.deprecatedPropertiesTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SbDeprecatedPropertiesApplication implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;
    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(SbDeprecatedPropertiesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        ConfProps0 cp0 = ctx.getBean(ConfProps0.class);
        ConfProps1 cp1 = ctx.getBean(ConfProps1.class);
        ConfProps2 cp2 = ctx.getBean(ConfProps2.class);
        System.out.println(cp0.getLevel0());
        System.out.println(cp1.getProp1());
        System.out.println("string list:");
        System.out.println(cp2.getStringList());
        System.out.println("string string map:");
        System.out.println(cp2.getStringStringMap());
        System.out.println(environment.getProperty("my.stringmap.key1"));
        System.out.println(environment.getProperty("my.stringmap.key2"));
        System.out.println(environment.getProperty("my.stringmap.key3"));
        System.out.println("enum enum map: ");
        System.out.println(cp2.getEnum1Enum2Map());
        System.out.println("enum string map:");
        System.out.println(cp2.enum2StringMap);

    }
}
