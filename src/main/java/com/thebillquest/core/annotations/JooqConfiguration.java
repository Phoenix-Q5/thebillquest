package com.thebillquest.core.annotations;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;
import static com.thebillquest.core.datasource.CommonDataSourceConfiguration.JOOQ_DEFAULT_CONFIGURATION;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Qualifier(JOOQ_DEFAULT_CONFIGURATION)
public @interface JooqConfiguration {
}
