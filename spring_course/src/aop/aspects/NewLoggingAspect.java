package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object AroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
    throws Throwable {
        System.out.println("AroundReturnBookLoggingAdvice : trying to return book");
        long begin = System.currentTimeMillis();
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("AroundReturnBookLoggingAdvice : return book");
        System.out.println("Target method takes " + (end-begin) + " millis");
        return targetMethodResult;

    }


}
