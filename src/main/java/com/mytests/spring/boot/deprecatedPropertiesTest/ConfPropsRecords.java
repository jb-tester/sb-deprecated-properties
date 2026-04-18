package com.mytests.spring.boot.deprecatedPropertiesTest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

@ConfigurationProperties(prefix = "deprecated.vars")
record RecordWithDeprecatedVars(
        @Deprecated(since = "date", forRemoval = true) @DeprecatedConfigurationProperty(replacement = "replacement.vars") String var1,
        @Deprecated(since = "date", forRemoval = true) @DeprecatedConfigurationProperty(replacement = "replacement.vars") Integer var2,
        @Deprecated(since = "date", forRemoval = true) @DeprecatedConfigurationProperty(replacement = "replacement.vars") Integer var3,
        @Deprecated @DeprecatedConfigurationProperty(replacement = "replacement.vars") Integer var4
) {}

@ConfigurationProperties(prefix = "derecated.record.vars")
@Deprecated(since = "date", forRemoval = true)
record DeprecatedRecordWithVars(
        String var1,
        Integer var2,
        Integer var3,
        Integer var4
) {}
@ConfigurationProperties(prefix = "replacement.vars")
record RecordWithReplacementVars(
        String newVar1,
        Integer newVar2,
        Integer newVar3,
        Integer newVar4
) {}
