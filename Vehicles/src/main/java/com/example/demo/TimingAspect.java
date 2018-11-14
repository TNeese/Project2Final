//package com.example.demo;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class TimingAspect {
//
//    @Pointcut("execution(public * com.example..*(..))")
//    public void publicMethod() {}
//
//    @Around("publicMethod() && @annotation(Timed)")
//    public Object profile(final ProceedingJoinPoint joinPoint) throws Throwable {
//        final long start = System.currentTimeMillis();
//        try {
//            return joinPoint.proceed();
//        } finally {
//            final long stop = System.currentTimeMillis();
//            System.out.println("+++ Execution time of " + joinPoint.getSignature().getName() +
//                               " was : " + (stop-start));
//        }
//    }
//}
