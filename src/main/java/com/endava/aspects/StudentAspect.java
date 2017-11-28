package com.endava.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class StudentAspect {

//    @Before("execution(* getName(..))")
//    public void printSomethingBefore(){
//        System.out.println("====> Something");
//    }

    @Pointcut("execution(* getName(..))") // a named pointcut
    public void getNamePointcut(){}

    @After("getNamePointcut()")
    public void willBeExecutedBefore(JoinPoint jp){
        System.out.println(jp.getTarget().getClass().getSimpleName());
        System.out.println(jp.getThis().getClass().getSimpleName());
    }

//    @Around("getNamePointcut()") // runs strange because of PrintStream that is used under the hood,
//                                 // it is a buffered stream and goes to output only when filled up
//    public Object aroundAdvice(ProceedingJoinPoint jp) throws Throwable {
//        System.out.println("---------> Before ProceedingJoinPoint");
//        Object proceed = jp.proceed();
//        System.out.println("---------> After ProceedingJoinPoint");
//        return proceed;
//    }

}
