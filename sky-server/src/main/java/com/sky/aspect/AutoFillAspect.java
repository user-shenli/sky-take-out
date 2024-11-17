//package com.sky.aspect;
//
//import com.sky.annotation.AutoFill;
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.Signature;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//import java.lang.classfile.MethodSignature;
//
///**
// * 自定义切面，实现自动填充
// */
//@Aspect
//@Component
//@Slf4j
//public class AutoFillAspect {
//    /**
//     * 切入点
//     */
//    @Pointcut("execution(* com.sky.mapper.*.*(..)) && @annotation(com.sky.annotation.AutoFill)")
//    public void autoFillPointCut(){}
//
//        @Before("autoFillPointCut()")
//        public void autoFill(JoinPoint joinPoint) {
//            log.info("开始自动填充...");
//
//            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//            AutoFill autofill = signature.getMethod().getAnnotion(AutoFill.class);
//    }
//
//}
