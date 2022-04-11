package com.mytests.spring.boot.deprecatedPropertiesTest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * *
 * <p>Created by irina on 4/11/2022.</p>
 * <p>Project: sb-deprecated-properties</p>
 * *
 */
@ConfigurationProperties("my.props2")
@Component
public class ConfProps2 {

    List<String> stringList;
    Map<String,String> stringStringMap;
    Map<Enum1,Enum2> enum1Enum2Map;
    Map<Enum2,String> enum2StringMap;

    @Deprecated
    @DeprecatedConfigurationProperty(replacement = "my.new.strlist")
    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    @Deprecated
    @DeprecatedConfigurationProperty(replacement = "my.stringmap")
    public Map<String, String> getStringStringMap() {
        return stringStringMap;
    }

    public void setStringStringMap(Map<String, String> stringStringMap) {
        this.stringStringMap = stringStringMap;
    }

    @Deprecated
    @DeprecatedConfigurationProperty(replacement = "my.props.maps.enums")
    public Map<Enum1, Enum2> getEnum1Enum2Map() {
        return enum1Enum2Map;
    }

    public void setEnum1Enum2Map(Map<Enum1, Enum2> enum1Enum2Map) {
        this.enum1Enum2Map = enum1Enum2Map;
    }

    @Deprecated
    @DeprecatedConfigurationProperty(replacement = "my.props.foo.buzz")
    public Map<Enum2, String> getEnum2StringMap() {
        return enum2StringMap;
    }

    public void setEnum2StringMap(Map<Enum2, String> enum2StringMap) {
        this.enum2StringMap = enum2StringMap;
    }
}
