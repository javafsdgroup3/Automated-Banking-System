# Automated-Banking-System

package com.tcs.RESTAPI.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ResourceInterceptor {

    private static final Logger log = LoggerFactory.getLogger(ResourceInterceptor.class);

    @Pointcut("execution(com/tcs/RESTAPI/resources/ProductResource)")
    public void loggingPointCut() {
    }

    @Before("loggingPointCut()")
    public void before(JoinPoint joinPoint) {
        log.info("Before method invoked :: " + joinPoint.getSignature());
    }

    @After("loggingPointCut()")
    public void after(JoinPoint joinPoint) {
        log.info("After method invoked :: " + joinPoint.getSignature());
    }
}
