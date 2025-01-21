package com.thebillquest.core.annotations;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

import static com.thebillquest.core.datasource.CommonDataSourceConfiguration.TRANSACTION_MANAGER;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Transactional(transactionManager =  TRANSACTION_MANAGER, isolation = Isolation.READ_COMMITTED)
public @interface TransactionRequired {
}
