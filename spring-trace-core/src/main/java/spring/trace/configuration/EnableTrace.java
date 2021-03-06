package spring.trace.configuration;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author: holyeye
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(TraceRegistrar.class)
public @interface EnableTrace {

	/**
	 * basePackages alias
	 * @return
	 */
	String[] value() default {};

	String[] basePackages() default {};

	Class<?>[] basePackageClasses() default {};

	boolean proxyTargetClass() default false;

	AdviceMode mode() default AdviceMode.PROXY;

}
