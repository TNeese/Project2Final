//package com.example.demo;
//
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class MyAspect {
//
//    @Pointcut("execution(public * com.example..*(..))")
//    public void allMethods() {}
//
//    @Around("allMethods() && @annotation(Counter)")
//    public void numOfCalls(final JoinPoint joinPoint){
//        System.out.println("*** Executing: " + joinPoint.getSignature());
//        Object[] arguments = joinPoint.getArgs();
//        for(Object argument : arguments) {
//            System.out.println("*** " + argument.getClass().getMethods());
//        }
//    }
//}
