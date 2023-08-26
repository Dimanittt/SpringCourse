package aop_testing.aspects;

import aop_testing.Car;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Pointcuts {

    @Pointcut("execution(void aop_testing.Autos.addAuto(..))")
    public void pointcutForCar(){}
}
