package aop_testing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("aop_testing")
@EnableAspectJAutoProxy
public class myConfiguration {
}
