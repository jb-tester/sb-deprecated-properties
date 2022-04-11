package com.mytests.spring.boot.deprecatedPropertiesTest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 4/11/2022.</p>
 * <p>Project: sb-deprecated-properties</p>
 * *
 */
@ConfigurationProperties("my.props.level0")
@Component
public class ConfProps1 {

   String prop1;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }
}
