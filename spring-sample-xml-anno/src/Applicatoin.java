import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dinesh.service.CustomerService;
import com.dinesh.service.CustomerServiceImpl;

public class Applicatoin {

	public static void main(String[] args) {
		
		/*CustomerService customerService=new CustomerServiceImpl();*/
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicatoinContext.xml");
		
		CustomerService customerService= applicationContext.getBean("customerService", CustomerService.class);
		
		System.out.println(" Customer First Name:"+customerService.findAll().get(0).getFirstName());

	}

}
