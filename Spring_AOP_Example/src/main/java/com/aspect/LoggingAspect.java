package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.model.Person.addPerson(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("method : " + joinPoint.getSignature().getName());
		System.out.println("******------******");
	}

	/*@After("execution(* com.model.Person.addPerson(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("logAfter() is running!");
		System.out.println("method : " + joinPoint.getSignature().getName());
		System.out.println("******------******");

	}*/
	
	/*@AfterReturning(
			pointcut = "execution(* com.model.Person.addPersonReturnValue(..))",
			returning= "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		System.out.println("logAfterReturning() is running!");
		System.out.println("method : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
		System.out.println("******------******");

	}*/
	
	/*@AfterThrowing(
			pointcut = "execution(* com.model.Person.addPersonThrowException(..))",
			throwing= "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

		System.out.println("logAfterThrowing() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("******------******");

	}*/
	
	
//	@Around("execution(* com.model.Person.addPersonAround(..))")
//	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
//
//		System.out.println("logAround() is running!");
//		System.out.println("method : " + joinPoint.getSignature().getName());
//		System.out.println("arguments : " + Arrays.toString(joinPoint.getArgs()));
//		
//		System.out.println("Around before is running!");
//		joinPoint.proceed();
//		System.out.println("Around after is running!");
//		
//		System.out.println("******");
//
//	}
	
}