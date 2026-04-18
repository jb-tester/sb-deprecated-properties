package com.mytests.spring.boot.deprecatedPropertiesTest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;
import org.springframework.stereotype.Component;


@ConfigurationProperties("my.props")
public class ConfProps0 {
    @Deprecated
    @DeprecatedConfigurationProperty(reason = "deprecated prefix test", replacement = "my.props.foo.bar")
    public String getLevel0() {
        return level0;
    }


    public void setLevel0(String level0) {
        this.level0 = level0;
    }

    String level0;

}
