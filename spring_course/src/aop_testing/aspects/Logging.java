package aop_testing.aspects;

import aop_testing.Car;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging {
    @Before("aop_testing.aspects.Pointcuts.pointcutForCar()")
    public void addCarLogging(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object[] arguments = joinPoint.getArgs();
        for (Object obj : arguments){
            if (obj instanceof String){
                System.out.println("The auto of " + obj);
            }
            else if (obj instanceof Car){
                Car myCar = (Car) obj;
                System.out.println("The car is - " + myCar.getName() +
                        ", The car was invented in " + myCar.getYear());
            }
        }
    }
}
