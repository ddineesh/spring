import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dinesh.service.CustomerService;

public class Applicatoin {

	public static void main(String[] args) {
		
		/*CustomerService customerService=new CustomerServiceImpl();*/
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		CustomerService customerService= applicationContext.getBean("customerService",CustomerService.class);
		System.out.println("service object"+customerService);
		System.out.println(" Customer First Name:"+customerService.findAll().get(0).getFirstName());
		//Try singelton scope of the bean, it should return the same instance how many times we call
		//Whereas in prototype we get different object every single time
		CustomerService customerService1= applicationContext.getBean("customerService",CustomerService.class);
		System.out.println("service object"+customerService1);
	}

}
