package thrift.annotation.server.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.aop.support.AopUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class KoalasAop {

    @Pointcut("execution(public * thrift.annotation.server.impl.*.*(..))")
    //@Pointcut("execution(public * thrift..*.Iface+.*(..))")
    public void myMethod(){}

    @Before("myMethod()")
    public void before1(JoinPoint joinPoint) throws NoSuchMethodException {
        System.out.println("method start1");
    }
}
