package com.mvcsample.DepInj;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
public class App 
{
    public static void main( String[] args )
    {
    	/******
    	 * Code to use XML Configuration
    	 *
    	 */
    
    	 ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
    	 Vehicle vh= (Vehicle) context.getBean("vehicle");
    	 System.out.println("Using XML COnfiguration");
    	 vh.drive();
    	
    	
    	/*Code to Use Annotation Based Configuration
    	 * 
    	 */
    	 ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
    	 Audi au = factory.getBean(Audi.class);
    	 System.out.println("Using Annotation Driven");
    	 au.drive();
    	
    }
}
